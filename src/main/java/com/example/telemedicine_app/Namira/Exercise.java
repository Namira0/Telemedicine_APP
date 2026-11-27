package com.example.telemedicine_app.Namira;

import java.io.Serializable;

public class Exercise implements Serializable {
    private final String exerciseId, planId;
    private String exerciseName, instructions;
    private int sets, repetitions;
    private boolean completed;

    public Exercise(String exerciseId, String planId, String name, String instructions, int sets, int repetitions) {
        this.exerciseId = exerciseId;
        this.planId = planId;
        this.exerciseName = name;
        this.instructions = instructions;
        this.sets = sets;
        this.repetitions = repetitions;
    }

    public String getExerciseId() {
        return exerciseId;
    }

    public String getPlanId() {
        return planId;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public String getInstructions() {
        return instructions;
    }

    public int getSets() {
        return sets;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "exerciseId='" + exerciseId + '\'' +
                ", planId='" + planId + '\'' +
                ", name='" + exerciseName + '\'' +
                ", instructions='" + instructions + '\'' +
                ", sets=" + sets +
                ", repetitions=" + repetitions +
                ", completed=" + completed +
                '}';
    }
    public int getTotalReps(){
        return sets * repetitions;
    }
    public void markCompleted(){
        this.completed = true;
    }
}

