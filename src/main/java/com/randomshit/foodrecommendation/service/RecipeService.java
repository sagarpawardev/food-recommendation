package com.randomshit.foodrecommendation.service;

import com.randomshit.foodrecommendation.pojo.Recipe;

import java.util.List;

public class RecipeService {
    public List<Recipe> getRecipes(){
        Recipe recipe = new Recipe();
        recipe.setName("Omelette");
        recipe.setUrl("https://www.youtube.com/watch?v=hViEZ9zz83E");

        return List.of(recipe);
    }

    public Recipe getRecommendation(){
        Recipe recipe = new Recipe();
        recipe.setName("Omelette");
        recipe.setUrl("https://www.youtube.com/watch?v=hViEZ9zz83E");
        return recipe;
    }
}
