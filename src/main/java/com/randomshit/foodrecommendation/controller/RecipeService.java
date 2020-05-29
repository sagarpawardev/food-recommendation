package com.randomshit.foodrecommendation.controller;

import com.randomshit.foodrecommendation.pojo.Recipe;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/recipes")
public class RecipeService {

    @RequestMapping(method = GET)
    public List<Recipe> getRecipes(){
        Recipe recipe = new Recipe();
        recipe.setName("Omelette");
        recipe.setUrl("https://www.youtube.com/watch?v=hViEZ9zz83E");

        return List.of(recipe);
    }

    @RequestMapping(path = "recommend", method = GET)
    public Recipe getRecommendation(){
        Recipe recipe = new Recipe();
        recipe.setName("Omelette");
        recipe.setUrl("https://www.youtube.com/watch?v=hViEZ9zz83E");
        return recipe;
    }

}
