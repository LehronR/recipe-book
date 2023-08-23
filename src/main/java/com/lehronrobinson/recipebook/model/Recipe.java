package com.lehronrobinson.recipebook.model;

public class Recipe {
    private String title;
    private String ingredients;
    private String directions;

    public Recipe() {
    }

    public Recipe(String title, String ingredients, String directions) {
        this.title = title;
        this.ingredients = ingredients;
        this.directions = directions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    @Override
    public String toString() {
        return "RecipeModel{" +
                "title='" + title + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", directions='" + directions + '\'' +
                '}';
    }
}
