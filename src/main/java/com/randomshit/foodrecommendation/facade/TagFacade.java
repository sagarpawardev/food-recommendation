package com.randomshit.foodrecommendation.facade;

import com.randomshit.foodrecommendation.dto.TagList;
import com.randomshit.foodrecommendation.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;

public class TagFacade {

    @Autowired
    private TagService tagService;

    public TagList getTags(){
        TagList tagList = new TagList();
        tagList.setTags(tagService.getTags());
        return tagList;
    }

}
