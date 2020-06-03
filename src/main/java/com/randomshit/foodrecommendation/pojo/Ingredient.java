package com.randomshit.foodrecommendation.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

@Entity
public class Ingredient {

    @Id
    @Pattern(regexp = "^[A-Z]{3,10}$")
    private String id;

    @Pattern(regexp = "^[a-z\\-]{3,10}$")
    private String name;

    //<editor-fold desc="Getters and Setters">

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //</editor-fold>
}
