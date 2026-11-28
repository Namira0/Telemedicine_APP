package com.example.telemedicine_app.nawrin;

import java.time.LocalDate;

public class Prescription {
    private String prescriptionId, verificationCode, labInvestigations;
    private Doctor doctor;
    private Patient patient;
    private Diagnosis diagnosis;
    private LocalDate issueDate;
    private boolean issued, viewed;

    public Prescription(Diagnosis diagnosis, Doctor doctor, boolean issued, LocalDate issueDate, String labInvestigations, Patient patient, String prescriptionId, String verificationCode, boolean viewed) {
        this.diagnosis = diagnosis;
        this.doctor = doctor;
        this.issued = issued;
        this.issueDate = issueDate;
        this.labInvestigations = labInvestigations;
        this.patient = patient;
        this.prescriptionId = prescriptionId;
        this.verificationCode = verificationCode;
        this.viewed = viewed;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getLabInvestigations() {
        return labInvestigations;
    }

    public void setLabInvestigations(String labInvestigations) {
        this.labInvestigations = labInvestigations;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "diagnosis=" + diagnosis +
                ", prescriptionId='" + prescriptionId + '\'' +
                ", verificationCode='" + verificationCode + '\'' +
                ", labInvestigations='" + labInvestigations + '\'' +
                ", doctor=" + doctor +
                ", patient=" + patient +
                ", issueDate=" + issueDate +
                ", issued=" + issued +
                ", viewed=" + viewed +
                '}';
    }
}
