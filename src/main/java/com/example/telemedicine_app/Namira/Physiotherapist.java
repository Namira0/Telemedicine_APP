package com.example.telemedicine_app.Namira;

import com.example.telemedicine_app.common.User;

import java.io.Serializable;
import java.time.LocalDate;

public class Physiotherapist extends User implements Serializable {
    private final String licenseNO;
    private String specialization, qualification, clinicName, bio, languageSpoken;
    private int yearsOfExperience;
    private double consultationFee;
    private boolean verified;

    public Physiotherapist(String userId, String name, String email, String address,
                           String password, String gender, String phoneNumber, LocalDate dateOfBirth,
                           LocalDate registrationDate, boolean active, String licenseNO, String specialization,
                           String qualification, String clinicName, String bio, String languageSpoken,
                           int yearsOfExperience, double consultationFee, boolean verified) {
        super(userId, name, email, address, password, gender, phoneNumber, dateOfBirth, registrationDate, active);
        this.licenseNO = licenseNO;
        this.specialization = specialization;
        this.qualification = qualification;
        this.clinicName = clinicName;
        this.bio = bio;
        this.languageSpoken = languageSpoken;
        this.yearsOfExperience = yearsOfExperience;
        this.consultationFee = consultationFee;
        this.verified = verified;
    }
    public String getLicenseNO() {
        return licenseNO;
    }
    public String getSpecialization() {
        return specialization;
    }
    public String getQualification() {
        return qualification;
    }
    public String getClinicName() {
        return clinicName;
    }
    public String getBio() {
        return bio;
    }
    public String getLanguageSpoken() {
        return languageSpoken;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public double getConsultationFee() {
        return consultationFee;
    }
    public boolean isVerified() {
        return verified;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }
    public void setLanguageSpoken(String languageSpoken) {
        this.languageSpoken = languageSpoken;
    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }
    public void setVerified(boolean verified) {
        this.verified = verified;
    }
    @Override
    public String toString() {
        return "Physiotherapist{" +
                "licenseNO='" + licenseNO + '\'' +
                ", specialization='" + specialization + '\'' +
                ", qualification='" + qualification + '\'' +
                ", clinicName='" + clinicName + '\'' +
                ", bio='" + bio + '\'' +
                ", languageSpoken='" + languageSpoken + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", consultationFee=" + consultationFee +
                ", verified=" + verified +
                '}';
    }
    // ---------- custom method ----------
    public void verify() {
        this.verified = true;
    }
    @Override
    public void showDashboard() {
        // later: the controller loads PhysiotherapistDashboard.fxml
        System.out.println("Physiotherapist dashboard of " + getName());
    }
}