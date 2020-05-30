package com.randomshit.foodrecommendation.service;

import com.randomshit.foodrecommendation.pojo.Recipe;
import com.randomshit.foodrecommendation.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    private List<Recipe> recipes = new ArrayList<>(0);
    private Random random = new Random();


    public List<Recipe> getRecipes(){
        loadRecipes();
        return recipes;
    }

    public Recipe getRecommendation(){
        loadRecipes();

        OptionalInt optInt = random.ints(0, recipes.size()).findFirst();
        if(optInt.isPresent()){
            int idx = optInt.getAsInt();
            return recipes.get(idx);
        }

        Recipe recipe = new Recipe();
        recipe.setName("No Suggestion");
        return recipe;
    }

    //<editor-fold desc="Private Method">
    private void loadRecipes(){
        if(recipes.isEmpty()) {
            recipeRepository.findAll().forEach(recipe -> recipes.add(recipe));
        }
    }
    //</editor-fold>
}
