package com.randomshit.foodrecommendation.controller;

import com.randomshit.foodrecommendation.pojo.Recipe;
import com.randomshit.foodrecommendation.service.RecipeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Resource(name="recipeService")
    private RecipeService recipeService;

    @RequestMapping(method = GET)
    public List<Recipe> getRecipes(){
        return recipeService.getRecipes();
    }

    @RequestMapping(path = "recommend", method = GET)
    public Recipe getRecommendation(){
        return recipeService.getRecommendation();
    }

}
