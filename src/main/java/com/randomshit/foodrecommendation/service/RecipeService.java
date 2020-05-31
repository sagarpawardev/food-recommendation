package com.randomshit.foodrecommendation.service;

import com.randomshit.foodrecommendation.exception.NotFoundException;
import com.randomshit.foodrecommendation.pojo.Recipe;
import com.randomshit.foodrecommendation.pojo.RecipeList;
import com.randomshit.foodrecommendation.repository.RecipeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.Yaml;

import javax.annotation.PostConstruct;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;

@Service
public class RecipeService {

    @Autowired
    private RecipeDao recipeDao;

    private final Random random = new Random();


    public List<Recipe> getRecipes() {
        List<Recipe> recipes = new ArrayList<>();
        recipeDao.findAll().forEach(recipes::add);
        return recipes;
    }

    public Recipe getRecommendation(List<String> tags) throws NotFoundException {
        List<Recipe> recipes;

        if (tags.isEmpty()) {
            // Fetch all
            recipes = new ArrayList<>(0);
            recipeDao.findAll().forEach(recipes::add);
        } else {
            // Filter by tags
            recipes = recipeDao.findByTags(tags);
        }


        if (!recipes.isEmpty()) {
            // Generate a random id and return response
            OptionalInt optInt = random.ints(0, recipes.size()).findFirst();
            if (optInt.isPresent()) {
                int idx = optInt.getAsInt();
                return recipes.get(idx);
            }
        }

        throw new NotFoundException();
    }

    //<editor-fold desc="Private Method">
    @PostConstruct
    private void loadRecipes() {
        Yaml yml = new Yaml();
        InputStream is = getClass().getClassLoader().getResourceAsStream("data/recipes.yml");
        RecipeList recipeList = yml.loadAs(is, RecipeList.class);
        recipeDao.saveAll(recipeList.getRecipes());
    }
    //</editor-fold>
}
