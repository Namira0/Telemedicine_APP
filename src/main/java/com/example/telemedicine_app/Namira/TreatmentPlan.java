package com.example.telemedicine_app.Namira;

import java.io.Serializable;
import java.time.LocalDate;

public class TreatmentPlan implements Serializable {
    private final String planId;
    private String patientId;
    private String physioId;
    private String diagnosis;
    private String goals;
    private String exercises;
    private LocalDate startDate;
    private int sessionperWeek;
    private int durationWeeks;
    private String precautions;

    public TreatmentPlan(String planId, String patientId, String physioId,
                         String diagnosis, String goals, String exercises,
                         LocalDate startDate, int sessionperWeek, int durationWeeks, String precautions) {
        this.planId = planId;
        this.patientId = patientId;
        this.physioId = physioId;
        this.diagnosis = diagnosis;
        this.goals = goals;
        this.exercises = exercises;
        this.startDate = startDate;
        this.sessionperWeek = sessionperWeek;
        this.durationWeeks = durationWeeks;
        this.precautions = precautions;
    }
    public String getPlanId() {
        return planId;
    }
    public String getPatientId() {
        return patientId;
    }
    public String getPhysioId() {
        return physioId;
    }
    public String getDiagnosis() {
        return diagnosis;
    }
    public String getGoals() {
        return goals;
    }
    public String getExercises() {
        return exercises;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public int getSessionperWeek() {
        return sessionperWeek;
    }
    public int getDurationWeeks() {
        return durationWeeks;
    }
    public String getPrecautions() {
        return precautions;
    }
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    public void setPhysioId(String physioId) {
        this.physioId = physioId;
    }
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public void setGoals(String goals) {
        this.goals = goals;
    }
    public void setExercises(String exercises) {
        this.exercises = exercises;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public void setSessionperWeek(int sessionperWeek) {
        this.sessionperWeek = sessionperWeek;
    }
    public void setDurationWeeks(int durationWeeks) {
        this.durationWeeks = durationWeeks;
    }
    public void setPrecautions(String precautions) {
        this.precautions = precautions;
    }
    @Override
    public String toString() {
        return "TreatmentPlan{" +
                "planId='" + planId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", physioId='" + physioId + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", goals='" + goals + '\'' +
                ", exercises='" + exercises + '\'' +
                ", startDate=" + startDate +
                ", sessionperWeek=" + sessionperWeek +
                ", durationWeeks=" + durationWeeks +
                ", precautions='" + precautions + '\'' +
                '}';
    }
    public int getTotalSessions() {
        return durationWeeks * sessionperWeek;
    }
}
