package com.example.demo.controller;

import com.example.demo.model.recipe.Recipe;
import com.example.demo.model.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("")
    public String getHome(Model model) {
        model.addAttribute("user", "Zuzana");

        return "home";
    }

    @GetMapping("/ingredients")
    public String getIngredients() {
        return "ingredients";
    }

//    @GetMapping("/add_recipe")
//    public String addRecipe(Model model) {
//        model.addAttribute("owner", "Zuzana");
//        return "add_recipe";
//    }

    @GetMapping("/index")
    public String logOut() {
        return "index";
    }
}
