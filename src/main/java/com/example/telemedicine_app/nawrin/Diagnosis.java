package com.example.telemedicine_app.nawrin;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Diagnosis {
    private String chiefComplaints, symptomDuration, primaryDiagnosis, icdCode, clinicalNotes, advice, status, provisionalDiagnoses;
    private int systolicBp, diastolicBp, pulseRate;
    private LocalDateTime finalizedAt;
    private float temperature;

    public Diagnosis(String advice, String chiefComplaints, String clinicalNotes, int diastolicBp, LocalDateTime finalizedAt, String icdCode, String primaryDiagnosis, String provisionalDiagnoses, int pulseRate, String status, String symptomDuration, int systolicBp, float temperature) {
        this.advice = advice;
        this.chiefComplaints = chiefComplaints;
        this.clinicalNotes = clinicalNotes;
        this.diastolicBp = diastolicBp;
        this.finalizedAt = finalizedAt;
        this.icdCode = icdCode;
        this.primaryDiagnosis = primaryDiagnosis;
        this.provisionalDiagnoses = provisionalDiagnoses;
        this.pulseRate = pulseRate;
        this.status = status;
        this.symptomDuration = symptomDuration;
        this.systolicBp = systolicBp;
        this.temperature = temperature;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getChiefComplaints() {
        return chiefComplaints;
    }

    public void setChiefComplaints(String chiefComplaints) {
        this.chiefComplaints = chiefComplaints;
    }

    public String getClinicalNotes() {
        return clinicalNotes;
    }

    public void setClinicalNotes(String clinicalNotes) {
        this.clinicalNotes = clinicalNotes;
    }

    public int getDiastolicBp() {
        return diastolicBp;
    }

    public void setDiastolicBp(int diastolicBp) {
        this.diastolicBp = diastolicBp;
    }

    public LocalDateTime getFinalizedAt() {
        return finalizedAt;
    }

    public void setFinalizedAt(LocalDateTime finalizedAt) {
        this.finalizedAt = finalizedAt;
    }

    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getPrimaryDiagnosis() {
        return primaryDiagnosis;
    }

    public void setPrimaryDiagnosis(String primaryDiagnosis) {
        this.primaryDiagnosis = primaryDiagnosis;
    }

    public String getProvisionalDiagnoses() {
        return provisionalDiagnoses;
    }

    public void setProvisionalDiagnoses(String provisionalDiagnoses) {
        this.provisionalDiagnoses = provisionalDiagnoses;
    }

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSymptomDuration() {
        return symptomDuration;
    }

    public void setSymptomDuration(String symptomDuration) {
        this.symptomDuration = symptomDuration;
    }

    public int getSystolicBp() {
        return systolicBp;
    }

    public void setSystolicBp(int systolicBp) {
        this.systolicBp = systolicBp;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Diagnosis{" +
                "advice='" + advice + '\'' +
                ", chiefComplaints='" + chiefComplaints + '\'' +
                ", symptomDuration='" + symptomDuration + '\'' +
                ", primaryDiagnosis='" + primaryDiagnosis + '\'' +
                ", icdCode='" + icdCode + '\'' +
                ", clinicalNotes='" + clinicalNotes + '\'' +
                ", status='" + status + '\'' +
                ", provisionalDiagnoses='" + provisionalDiagnoses + '\'' +
                ", systolicBp=" + systolicBp +
                ", diastolicBp=" + diastolicBp +
                ", pulseRate=" + pulseRate +
                ", finalizedAt=" + finalizedAt +
                ", temperature=" + temperature +
                '}';
    }
}
