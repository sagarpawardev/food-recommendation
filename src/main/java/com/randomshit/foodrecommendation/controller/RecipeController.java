package com.randomshit.foodrecommendation.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.randomshit.foodrecommendation.exception.NotFoundException;
import com.randomshit.foodrecommendation.pojo.Recipe;
import com.randomshit.foodrecommendation.service.RecipeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.apache.commons.lang3.StringUtils.EMPTY;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Resource(name="recipeService")
    private RecipeService recipeService;

    @RequestMapping(method = GET)
    public List<Recipe> getRecipes(){
        return recipeService.getRecipes();
    }

    @CrossOrigin
    @GetMapping(path = "recommend")
    @HystrixCommand(fallbackMethod = "fallbackGetRecommendation")
    public Recipe getRecommendation(
            @RequestParam(name = "tags", required = false, defaultValue = EMPTY)  List<String> tags
    ) throws NotFoundException {
        return recipeService.getRecommendation(tags);
    }

    //<editor-fold desc="Fallback Method">

    public Recipe fallbackGetRecommendation(List<String> tags){
        Recipe recipe = new Recipe();
        recipe.setName("Noting to Recommend");
        recipe.setUrl(EMPTY);
        return recipe;
    }

    //</editor-fold>

}
