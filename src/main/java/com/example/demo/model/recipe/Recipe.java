package com.example.demo.model.recipe;

public class Recipe {

    private static int lastId = 0;
    private Integer recipeId;
    private Integer mainIngredientId;
    private String name;
    private int cookingTime;
    private String mainIngredient;
    private String ingredients;
    private String cookingProcedure;

    public Recipe(Integer mainIngredientId, String name, int cookingTime, String mainIngredient, String ingredients, String cookingProcedure) {
        this.recipeId = lastId++;
        this.mainIngredientId = mainIngredientId;
        this.name = name;
        this.cookingTime = cookingTime;
        this.mainIngredient = mainIngredient;
        this.ingredients = ingredients;
        this.cookingProcedure = cookingProcedure;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getCookingProcedure() {
        return cookingProcedure;
    }

    public void setCookingProcedure(String cookingProcedure) {
        this.cookingProcedure = cookingProcedure;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public Integer getMainIngredientId() {
        return mainIngredientId;
    }

    public void setMainIngredientId(int mainIngredientId) {
        this.mainIngredientId = mainIngredientId;
    }
}
