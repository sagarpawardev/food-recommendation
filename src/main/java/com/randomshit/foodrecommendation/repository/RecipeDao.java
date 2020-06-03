package com.randomshit.foodrecommendation.repository;

import com.randomshit.foodrecommendation.pojo.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RecipeDao extends CrudRepository<Recipe, Integer> {

}
