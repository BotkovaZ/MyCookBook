package com.example.demo.controller;

import com.example.demo.model.ingredient.Ingredient;
import com.example.demo.model.ingredient.IngredientsProvider;
import com.example.demo.model.recipe.Recipe;
import com.example.demo.model.recipe.RecipesProvider;
import org.springframework.boot.Banner;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/ingredients")
public class IngredientController {

    @GetMapping("")
    public String getIngredients(Model model) {
        model.addAttribute("ingredients", IngredientsProvider.getIngredients());

        return "ingredients";
    }

//    @GetMapping("/details/{id}")
//    public String getRecipes(@PathVariable("id") Integer id, Model model) {
//        List<Recipe> temporaryRecipes = new ArrayList<>();
//
//        for (Recipe r: RecipesProvider.getRecipes()) {
//            if (r.getMainIngredientId() == id) {
//                temporaryRecipes.add(r);
//            }
//        }
//
//        model.addAttribute("recipes", temporaryRecipes);
//
//        return "details";
//    }

    @GetMapping("/recipes")
    public String getRecipes() {
        return "recipes";
    }

    @GetMapping("/home")
    public String getHome() {
        return "home";
    }

    @PostMapping("/addIngredient")
    @ResponseBody
    public ResponseEntity<Ingredient> ingredientSubmit(@ModelAttribute Ingredient ingredient) {
        IngredientsProvider.addIngredient(ingredient);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/ingredients");
        return new ResponseEntity<>(headers, HttpStatus.SEE_OTHER);
    }

    @GetMapping("/index")
    public String logOut() {
        return "index";
    }
}
















