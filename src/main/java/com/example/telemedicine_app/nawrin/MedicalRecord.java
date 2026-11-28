package com.example.telemedicine_app.nawrin;

public class MedicalRecord {
    private String bloodGroup, allergies, chronicConditions, pastSurgeries,familyHistory, currentMedications,accessLog;
    private float heightCm, weightKg;
    private  MedicalDocument medicalDocument;
    private Consultation consultation;

    public MedicalRecord(String accessLog, String allergies, String bloodGroup, String chronicConditions, Consultation consultation, String currentMedications, String familyHistory, float heightCm, MedicalDocument medicalDocument, String pastSurgeries, float weightKg) {
        this.accessLog = accessLog;
        this.allergies = allergies;
        this.bloodGroup = bloodGroup;
        this.chronicConditions = chronicConditions;
        this.consultation = consultation;
        this.currentMedications = currentMedications;
        this.familyHistory = familyHistory;
        this.heightCm = heightCm;
        this.medicalDocument = medicalDocument;
        this.pastSurgeries = pastSurgeries;
        this.weightKg = weightKg;
    }

    public String getAccessLog() {
        return accessLog;
    }

    public void setAccessLog(String accessLog) {
        this.accessLog = accessLog;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getChronicConditions() {
        return chronicConditions;
    }

    public void setChronicConditions(String chronicConditions) {
        this.chronicConditions = chronicConditions;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    public String getCurrentMedications() {
        return currentMedications;
    }

    public void setCurrentMedications(String currentMedications) {
        this.currentMedications = currentMedications;
    }

    public String getFamilyHistory() {
        return familyHistory;
    }

    public void setFamilyHistory(String familyHistory) {
        this.familyHistory = familyHistory;
    }

    public float getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(float heightCm) {
        this.heightCm = heightCm;
    }

    public MedicalDocument getMedicalDocument() {
        return medicalDocument;
    }

    public void setMedicalDocument(MedicalDocument medicalDocument) {
        this.medicalDocument = medicalDocument;
    }

    public String getPastSurgeries() {
        return pastSurgeries;
    }

    public void setPastSurgeries(String pastSurgeries) {
        this.pastSurgeries = pastSurgeries;
    }

    public float getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(float weightKg) {
        this.weightKg = weightKg;
    }

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "accessLog='" + accessLog + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", allergies='" + allergies + '\'' +
                ", chronicConditions='" + chronicConditions + '\'' +
                ", pastSurgeries='" + pastSurgeries + '\'' +
                ", familyHistory='" + familyHistory + '\'' +
                ", currentMedications='" + currentMedications + '\'' +
                ", heightCm=" + heightCm +
                ", weightKg=" + weightKg +
                ", medicalDocument=" + medicalDocument +
                ", consultation=" + consultation +
                '}';
    }
}
