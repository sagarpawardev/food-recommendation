package com.randomshit.foodrecommendation.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.randomshit.foodrecommendation.dto.RecipeDto;
import com.randomshit.foodrecommendation.dto.TagList;
import com.randomshit.foodrecommendation.exception.NotFoundException;
import com.randomshit.foodrecommendation.facade.RecipeFacade;
import com.randomshit.foodrecommendation.facade.TagFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.apache.commons.lang3.StringUtils.EMPTY;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    private RecipeFacade recipeFacade;

    @Autowired
    private TagFacade tagFacade;

    @RequestMapping(method = GET)
    public List<RecipeDto> getRecipes(){
        return recipeFacade.getRecipes();
    }

    @CrossOrigin
    @GetMapping(path = "recommend")
    @HystrixCommand(fallbackMethod = "fallbackGetRecommendation")
    public RecipeDto getRecommendation(
            @RequestParam(name = "tags", required = false, defaultValue = EMPTY)  Set<String> tags
    ) throws NotFoundException {
        return recipeFacade.getRecommendation(tags);
    }

    @CrossOrigin
    @GetMapping(path = "tags")
    public TagList getTags(){
        return tagFacade.getTags();
    }

    //<editor-fold desc="Fallback Method">

    public RecipeDto fallbackGetRecommendation(Set<String> tags, Throwable throwable){
        if(throwable!=null) {
            RecipeDto recipe = new RecipeDto();
            recipe.setName("Noting to Recommend for tags: "+tags);
            recipe.setUrl(EMPTY);
            return recipe;
        }
        return null;
    }

    //</editor-fold>

}
