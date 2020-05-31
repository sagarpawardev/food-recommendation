package com.randomshit.foodrecommendation.repository;

import com.randomshit.foodrecommendation.pojo.Recipe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface RecipeDao extends CrudRepository<Recipe, Integer> {


    @Query(value = "SELECT * FROM RECIPE r \n" +
            "            WHERE r.ID IN (\n" +
            "                  SELECT t.recipe_id FROM RECIPE_TAG t\n" +
            "                       WHERE t.tag IN :tags \n" +
            "                       GROUP BY t.recipe_id \n" +
            "                       HAVING count(t.tag) >= :tagCount\n" +
            "          )",
            nativeQuery = true
    )
    //where r.id IN (SELECT DISTINCT rt.recipe_id FROM RecipeTag rt WHERE rt.tag IN :tags)
    List<Recipe> findByTags(@Param("tags") Collection<String> tags, @Param("tagCount") int tagCount);

    default List<Recipe> findByTags(List<String> tags){
        return this.findByTags(tags, tags.size());
    }
}
