package se.lexicon.mattias.jpa_assignment.data;

import se.lexicon.mattias.jpa_assignment.model.entities.Ingredient;

import java.util.Collection;

public interface IngredientDAO {

    Ingredient findById(int ingredientId);
    Collection<Ingredient> findAll();
    Ingredient create(Ingredient ingredient);
    Ingredient update(Ingredient ingredient);
    void delete(int ingredientId);

    Ingredient findByExactName(String name);
    Collection<Ingredient> findByPartialName(String partial);

}
