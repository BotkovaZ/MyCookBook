package com.example.demo.controller;

import com.example.demo.model.recipe.Recipe;
import com.example.demo.model.recipe.RecipesProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/recipes")
public class RecipesController {

    @GetMapping("")
    public String getRecipes(Model model) {
        model.addAttribute("recipes", RecipesProvider.getRecipes());

        return "recipes";
    }

    @GetMapping("/details/{id}")
    public String getSingleRecipe(@PathVariable("id") Integer id, Model model) {
        Recipe r = RecipesProvider.findRecipeById(id);

        model.addAttribute("recipe", r);

        return "details";
    }

    @GetMapping("/home")
    public String getHome() {
        return "home";
    }

    @GetMapping("/ingredients")
    public String getIngredients() {
        return "ingredients";
    }

    @GetMapping("/index")
    public String logOut() {
        return "index";
    }

    @PostMapping("/addRecipe")
    public ResponseEntity<Recipe> addRecipe(Recipe recipe) {

        if (recipe.getMainIngredient().equals("Chicken") || recipe.getMainIngredient().equals("chicken")) {
            recipe.setMainIngredientId(1);
        } else if (recipe.getMainIngredient().equals("Pasta") || recipe.getMainIngredient().equals("pasta")) {
            recipe.setMainIngredientId(2);
        } else if (recipe.getMainIngredient().equals("Mozzarella") || recipe.getMainIngredient().equals("mozzarella")) {
            recipe.setMainIngredientId(3);
        } else if (recipe.getMainIngredient().equals("Rice") || recipe.getMainIngredient().equals("rice")) {
            recipe.setMainIngredientId(4);
        } else if (recipe.getMainIngredient().equals("Potatoes") || recipe.getMainIngredient().equals("potatoes")) {
            recipe.setMainIngredientId(5);
        } else if (recipe.getMainIngredient().equals("Salomon") || recipe.getMainIngredient().equals("salomon")) {
            recipe.setMainIngredientId(6);
        } else if (recipe.getMainIngredient().equals("Eggs") || recipe.getMainIngredient().equals("eggs")) {
            recipe.setMainIngredientId(7);
        } else {
            recipe.setMainIngredientId(8);
        }

        RecipesProvider.addRecipe(recipe);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/recipes");

        return new ResponseEntity<>(headers, HttpStatus.SEE_OTHER);
    }
}
