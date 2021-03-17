package se.lexicon.mattias.jpa_assignment.model.entities;

public class RecipeInstruction {

    private String instructionId;
    private String instructions;

    public RecipeInstruction(String instructionId, String instructions) {
        this.instructionId = instructionId;
        this.instructions = instructions;
    }

    public RecipeInstruction() {
    }

    public String getInstructionId() {
        return instructionId;
    }

    public void setInstructionId(String instructionId) {
        this.instructionId = instructionId;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
