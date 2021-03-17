package se.lexicon.mattias.jpa_assignment.data;


import se.lexicon.mattias.jpa_assignment.model.entities.Recipe;

import java.util.Collection;
import java.util.Locale;
import java.util.Optional;

public interface RecipeDAO {

    Recipe findById(int recipeId);
    Collection<Recipe> findAll();
    Recipe create(Recipe recipe);
    Recipe update(Recipe recipe);
    void delete(int recipeId);

    Collection<Recipe> findByName(String name);
    Collection<Recipe> findAllIngredientBased(String ingredient);
    Collection<Recipe> findByCategory(String category);
    Collection<Recipe> findAllCategoryBased(Collection<Locale.Category> categories);

}
