package se.lexicon.mattias.jpa_assignment.data;


import se.lexicon.mattias.jpa_assignment.model.entities.RecipeInstruction;

import java.util.Collection;

public interface RecipeInstructionDAO {

    RecipeInstruction findById(String recipeInstructionId);
    Collection<RecipeInstruction> findAll();
    RecipeInstruction create(RecipeInstruction recipeInstruction);
    RecipeInstruction update(RecipeInstruction recipeInstruction);
    void delete(String recipeInstructionId);

}
