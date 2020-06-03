package com.randomshit.foodrecommendation.facade;

import com.randomshit.foodrecommendation.converter.RecipeConverter;
import com.randomshit.foodrecommendation.dto.RecipeDto;
import com.randomshit.foodrecommendation.exception.NotFoundException;
import com.randomshit.foodrecommendation.pojo.Recipe;
import com.randomshit.foodrecommendation.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RecipeFacade {

    @Autowired
    private RecipeConverter recipeConverter;

    @Autowired
    private RecipeService recipeService;

    public RecipeDto getRecommendation(Set<String> tags) throws NotFoundException {
        Recipe recipe = recipeService.getRecommendation(tags);
        return recipeConverter.convert(recipe);
    }

    public List<RecipeDto> getRecipes(){
        return recipeService.getRecipes()
                .stream()
                .map(recipeConverter::convert)
                .collect(Collectors.toList());
    }
}
