package com.example.demo.model.ingredient;

import java.util.ArrayList;

public class IngredientsProvider {

    private static ArrayList<Ingredient> ingredients;

    static {
        ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("Chicken"));
        ingredients.add(new Ingredient("Pasta"));
        ingredients.add(new Ingredient("Mozzarella"));
        ingredients.add(new Ingredient("Rice"));
        ingredients.add(new Ingredient("Potatoes"));
        ingredients.add(new Ingredient("Salomon"));
        ingredients.add(new Ingredient("Eggs"));
        ingredients.add(new Ingredient("Other things"));
    }

    public static ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public static Ingredient getIngredientById(int id) {
        for (Ingredient i: ingredients) {
            if (i.getIngredientId() == id)
                return i;
        }
        return null;
    }

    public static void addIngredient(Ingredient i) {
        ingredients.add(i);
    }
}
