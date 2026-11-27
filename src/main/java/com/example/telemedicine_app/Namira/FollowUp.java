package com.example.telemedicine_app.Namira;

import java.io.Serializable;
import java.time.LocalDate;

public class FollowUp implements Serializable {
    private  final String followUpId;
    private  final String planId;
    private LocalDate followUpDate;
    private LocalDate nextFollowUpDate;
    private int painLevel;
    private float exerciseCompletionPercent;
    private String patientFeedback;
    private String progressStatus;

    public FollowUp(String followUpId, String planId, LocalDate followUpDate, LocalDate nextFollowUpDate, int paintLevel, float exerciseCompletionPercent, String patientFeedback, String progressStatus) {
        this.followUpId = followUpId;
        this.planId = planId;
        this.followUpDate = followUpDate;
        this.nextFollowUpDate = nextFollowUpDate;
        this.painLevel = paintLevel;
        this.exerciseCompletionPercent = exerciseCompletionPercent;
        this.patientFeedback = patientFeedback;
        this.progressStatus = progressStatus;
    }

    public String getFollowUpId() {
        return followUpId;
    }

    public String getPlanId() {
        return planId;
    }

    public LocalDate getFollowUpDate() {
        return followUpDate;
    }

    public LocalDate getNextFollowUpDate() {
        return nextFollowUpDate;
    }

    public int getPaintLevel() {
        return painLevel;
    }

    public float getExerciseCompletionPercent() {
        return exerciseCompletionPercent;
    }

    public String getPatientFeedback() {
        return patientFeedback;
    }

    public String getProgressStatus() {
        return progressStatus;
    }

    public void setFollowUpDate(LocalDate followUpDate) {
        this.followUpDate = followUpDate;
    }

    public void setNextFollowUpDate(LocalDate nextFollowUpDate) {
        this.nextFollowUpDate = nextFollowUpDate;
    }

    public void setPaintLevel(int paintLevel) {
        this.painLevel = paintLevel;
    }

    public void setExerciseCompletionPercent(float exerciseCompletionPercent) {
        this.exerciseCompletionPercent = exerciseCompletionPercent;
    }

    public void setPatientFeedback(String patientFeedback) {
        this.patientFeedback = patientFeedback;
    }

    public void setProgressStatus(String progressStatus) {
        this.progressStatus = progressStatus;
    }

    @Override
    public String toString() {
        return "FollowUp{" +
                "followUpId='" + followUpId + '\'' +
                ", planId='" + planId + '\'' +
                ", followUpDate=" + followUpDate +
                ", nextFollowUpDate=" + nextFollowUpDate +
                ", paintLevel=" + painLevel +
                ", exerciseCompletionPercent=" + exerciseCompletionPercent +
                ", patientFeedback='" + patientFeedback + '\'' +
                ", progressStatus='" + progressStatus + '\'' +
                '}';
    }
    public boolean isWorsening() {
        return progressStatus.equals("Worsening");
    }
}
