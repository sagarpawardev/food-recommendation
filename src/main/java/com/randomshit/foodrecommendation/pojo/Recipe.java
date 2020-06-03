package com.randomshit.foodrecommendation.pojo;

import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.EAGER;

@Entity
public class Recipe {

    @Id
    @Pattern(regexp = "^[A-Z]{3,10}$")
    private String id;

    private String name;

    @URL
    private String url;

    @ElementCollection( targetClass = String.class, fetch = EAGER)
    @JoinColumn(name = "recipe_id")
    private Set<String> tags = new HashSet<>();

    @ManyToMany(fetch = EAGER,
            cascade = {PERSIST, MERGE})
    private Set<Ingredient> ingredients = new HashSet<>();

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

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    //</editor-fold>
}
