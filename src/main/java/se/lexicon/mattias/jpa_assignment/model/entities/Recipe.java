package se.lexicon.mattias.jpa_assignment.model.entities;

import java.util.Collection;

public class Recipe {

    private int recipeId;
    private String recipeName;
    private Collection<RecipeIngredient> recipeIngredients;
    private RecipeInstruction recipeInstruction;
    private Collection<RecipeCategory> categories;

    public Recipe(int recipeId, String recipeName, Collection<RecipeIngredient> recipeIngredients, RecipeInstruction recipeInstruction, Collection<RecipeCategory> categories) {
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.recipeIngredients = recipeIngredients;
        this.recipeInstruction = recipeInstruction;
        this.categories = categories;
    }

    public Recipe() {
    }

    public int getRecipeId() {
        return recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public Collection<RecipeIngredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(Collection<RecipeIngredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public RecipeInstruction getRecipeInstruction() {
        return recipeInstruction;
    }

    public void setRecipeInstruction(RecipeInstruction recipeInstruction) {
        this.recipeInstruction = recipeInstruction;
    }

    public Collection<RecipeCategory> getCategories() {
        return categories;
    }

    public void setCategories(Collection<RecipeCategory> categories) {
        this.categories = categories;
    }
}
