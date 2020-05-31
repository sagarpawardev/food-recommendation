package com.randomshit.foodrecommendation.pojo;

import org.apache.commons.lang3.StringUtils;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class RecipeTag {

    @Id
    @GeneratedValue( strategy = IDENTITY)
    private int id;

    private String tag;

    //<editor-fold desc="Getters and Setters">
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    //</editor-fold>

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(!(obj instanceof RecipeTag))
            return false;

        RecipeTag recipeTag = (RecipeTag) obj;
        return this.id == recipeTag.id && StringUtils.equals(recipeTag.tag, this.tag);
    }
}
