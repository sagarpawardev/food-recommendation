package com.randomshit.foodrecommendation.service;

import com.randomshit.foodrecommendation.repository.RecipeTagsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TagService {

    @Autowired
    private RecipeTagsDao recipeTagsDao;

    public Set<String> getTags(){
        return recipeTagsDao.getDistinctTags();
    }
}
