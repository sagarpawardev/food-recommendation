package com.randomshit.foodrecommendation.service;

import com.randomshit.foodrecommendation.exception.NotFoundException;
import com.randomshit.foodrecommendation.pojo.Recipe;
import com.randomshit.foodrecommendation.repository.RecipeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

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

    public Recipe getRecommendation(Set<String> tags) throws NotFoundException {
        final List<Recipe> recipes = new LinkedList<>();

        if (tags.isEmpty()) {
            // Fetch all
            recipeDao.findAll().forEach(recipes::add);
        } else {
            // Filter by tags
            recipeDao.findAll().forEach( recipe -> {
                if(recipe.getTags().containsAll(tags)){
                    recipes.add(recipe);
                }
            });
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
}
