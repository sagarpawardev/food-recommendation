package com.randomshit.foodrecommendation.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
import static javax.persistence.CascadeType.ALL;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id = -1;

    private String name;

    private String url;

    @OneToMany( cascade = ALL, orphanRemoval = true)
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
