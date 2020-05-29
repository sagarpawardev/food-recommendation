package com.randomshit.foodrecommendation.service;

import com.randomshit.foodrecommendation.pojo.Recipe;
import com.randomshit.foodrecommendation.pojo.RecipeList;
import org.springframework.core.io.ClassPathResource;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;

public class RecipeService {

    private List<Recipe> recipes = new ArrayList<>(0);
    private Random random = new Random();

    public RecipeService(){
        loadRecipes();
    }


    public List<Recipe> getRecipes(){
        return recipes;
    }

    public Recipe getRecommendation(){
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
        Yaml yml = new Yaml();
        InputStream is = getClass().getClassLoader().getResourceAsStream("data/recipes.yml");
        RecipeList recipeList = yml.loadAs(is, RecipeList.class);
        recipes.addAll(recipeList.getRecipes());

    }
    //</editor-fold>
}
