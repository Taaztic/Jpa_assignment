package se.lexicon.mattias.jpa_assignment.data;


import se.lexicon.mattias.jpa_assignment.model.entities.RecipeIngredient;

import java.util.Collection;

public interface RecipeIngredientDAO {

    RecipeIngredient findById(String recipeIngredientId);
    Collection<RecipeIngredient> findAll();
    RecipeIngredient create(RecipeIngredient recipeIngredient);
    RecipeIngredient update(RecipeIngredient recipeIngredient);
    void delete(String recipeIngredientId);
}
