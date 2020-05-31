package com.randomshit.foodrecommendation.pojo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.EAGER;

@Entity
public class Recipe{

    @Id
    private String id;

    private String name;

    private String url;

    @OneToMany( cascade = ALL, orphanRemoval = true, fetch = EAGER)
    @JoinColumn(name = "recipe_id")
    private Set<RecipeTag> tags = new HashSet<>();


    public void addTag(RecipeTag tag){
        tags.add(tag);
    }

    public void removeTag(RecipeTag tag){
        tags.remove(tag);
    }

    //<editor-fold desc="Getters and Setters">
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<RecipeTag> getTags() {
        return tags;
    }

    public void setTags(Set<RecipeTag> tags) {
        this.tags = tags;
    }
    //</editor-fold>
}
