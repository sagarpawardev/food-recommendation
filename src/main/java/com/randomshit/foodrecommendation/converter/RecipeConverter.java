package com.randomshit.foodrecommendation.converter;

import com.randomshit.foodrecommendation.dto.RecipeDto;
import com.randomshit.foodrecommendation.pojo.Recipe;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

public class RecipeConverter implements Converter<Recipe, RecipeDto> {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public RecipeDto convert(Recipe source) {

        Set<String> ingredients = new HashSet<>();
        source.getIngredients().forEach(ingredient -> ingredients.add(ingredient.getName()));

        RecipeDto recipeDto = modelMapper.map(source, RecipeDto.class);
        recipeDto.setIngredients(ingredients);

        return recipeDto;
    }

}
