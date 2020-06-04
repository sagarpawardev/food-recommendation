package com.randomshit.foodrecommendation.repository;

import com.randomshit.foodrecommendation.pojo.Recipe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;


@Repository
public interface RecipeTagsDao extends CrudRepository<Recipe, Integer> {

    @Query(
        value = "SELECT DISTINCT t.tags FROM recipe_tags t",
        nativeQuery = true
    )
    Set<String> getDistinctTags();

}
