package com.example.telemedicine_app.nawrin;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Consultation {
    private String consultationId;
    private Appointment appointment;
    private LocalDateTime startedAt, endedAt;
    private boolean sessionActive, patientWaiting, patientAdmitted, microphoneOn, cameraOn;
    private Diagnosis diagnosis;
    private Prescription prescription;
    private Review review;
    private ArrayList<MedicalDocument> sharedFiles;
    private ArrayList<String> chatLog;

    public Consultation(Appointment appointment, boolean cameraOn, ArrayList<String> chatLog, String consultationId, Diagnosis diagnosis, LocalDateTime endedAt, boolean microphoneOn, boolean patientAdmitted, boolean patientWaiting, Prescription prescription, Review review, boolean sessionActive, ArrayList<MedicalDocument> sharedFiles, LocalDateTime startedAt) {
        this.appointment = appointment;
        this.cameraOn = cameraOn;
        this.chatLog = chatLog;
        this.consultationId = consultationId;
        this.diagnosis = diagnosis;
        this.endedAt = endedAt;
        this.microphoneOn = microphoneOn;
        this.patientAdmitted = patientAdmitted;
        this.patientWaiting = patientWaiting;
        this.prescription = prescription;
        this.review = review;
        this.sessionActive = sessionActive;
        this.sharedFiles = sharedFiles;
        this.startedAt = startedAt;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public boolean isCameraOn() {
        return cameraOn;
    }

    public void setCameraOn(boolean cameraOn) {
        this.cameraOn = cameraOn;
    }

    public ArrayList<String> getChatLog() {
        return chatLog;
    }

    public void setChatLog(ArrayList<String> chatLog) {
        this.chatLog = chatLog;
    }

    public String getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(String consultationId) {
        this.consultationId = consultationId;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public LocalDateTime getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(LocalDateTime endedAt) {
        this.endedAt = endedAt;
    }

    public boolean isMicrophoneOn() {
        return microphoneOn;
    }

    public void setMicrophoneOn(boolean microphoneOn) {
        this.microphoneOn = microphoneOn;
    }

    public boolean isPatientAdmitted() {
        return patientAdmitted;
    }

    public void setPatientAdmitted(boolean patientAdmitted) {
        this.patientAdmitted = patientAdmitted;
    }

    public boolean isPatientWaiting() {
        return patientWaiting;
    }

    public void setPatientWaiting(boolean patientWaiting) {
        this.patientWaiting = patientWaiting;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public boolean isSessionActive() {
        return sessionActive;
    }

    public void setSessionActive(boolean sessionActive) {
        this.sessionActive = sessionActive;
    }

    public ArrayList<MedicalDocument> getSharedFiles() {
        return sharedFiles;
    }

    public void setSharedFiles(ArrayList<MedicalDocument> sharedFiles) {
        this.sharedFiles = sharedFiles;
    }

    public LocalDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(LocalDateTime startedAt) {
        this.startedAt = startedAt;
    }

    @Override
    public String toString() {
        return "Consultation{" +
                "appointment=" + appointment +
                ", consultationId='" + consultationId + '\'' +
                ", startedAt=" + startedAt +
                ", endedAt=" + endedAt +
                ", sessionActive=" + sessionActive +
                ", patientWaiting=" + patientWaiting +
                ", patientAdmitted=" + patientAdmitted +
                ", microphoneOn=" + microphoneOn +
                ", cameraOn=" + cameraOn +
                ", diagnosis=" + diagnosis +
                ", prescription=" + prescription +
                ", review=" + review +
                ", sharedFiles=" + sharedFiles +
                ", chatLog=" + chatLog +
                '}';
    }
}

