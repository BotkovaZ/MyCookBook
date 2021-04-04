package com.example.demo.model.ingredient;

import com.example.demo.model.recipe.Recipe;

import java.util.ArrayList;
import java.util.List;

public class Ingredient {

    private Integer ingredientId;
    private static int lastId;
    private String name;
    List<Recipe> recipesWithIngredientId;

    public Ingredient(String name) {
        this.ingredientId = lastId++;
        this.name = name;
    }

    public Integer getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Recipe> getRecipesWithIngredientId() {
        return recipesWithIngredientId;
    }

    public void setRecipesWithIngredientId(ArrayList<Recipe> recipesWithIngredientId) {
        this.recipesWithIngredientId = recipesWithIngredientId;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + ingredientId +
                ", name='" + name + '\'' +
                '}';
    }
}
