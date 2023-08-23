package com.lehronrobinson.recipebook.controller;

import com.lehronrobinson.recipebook.model.Recipe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class RecipeController {
@GetMapping
public String home(Model model) {

    model.addAttribute("recipe", new Recipe());

    return "index";
}

@PostMapping("/addRecipe")
public String addNewRecipe(Recipe recipe, Model model) {
    model.addAttribute("recipe", recipe);

    return "newRecipe";
}


}
