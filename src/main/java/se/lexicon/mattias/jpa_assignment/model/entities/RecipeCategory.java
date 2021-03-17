package se.lexicon.mattias.jpa_assignment.model.entities;

import java.util.Collection;

public class RecipeCategory {

    private int categoryId;
    private String category;
    private Collection<Recipe> recipes;

    public RecipeCategory(int categoryId, String category, Collection<Recipe> recipes) {
        this.categoryId = categoryId;
        this.category = category;
        this.recipes = recipes;
    }

    public RecipeCategory() {
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Collection<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Collection<Recipe> recipes) {
        this.recipes = recipes;
    }
}
