package com.example.telemedicine_app.Namira;

import com.example.telemedicine_app.common.User;

import java.time.LocalDate;

public class Physiotherapist extends User {
    private String LicenseNo,Specialization,Qualification,ClinicName,Bio,availability,LanguageSpoken;
    private int YearsOfExperience;
    private float ConsultationFee;
    private boolean verified;

    public Physiotherapist(String userId, String name, String email, String address,
                           String password, String gender, int phoneNumber, LocalDate dateOfBirth,
                           String licenseNo, String specialization, String qualification, String clinicName,
                           String bio, String availability, String languageSpoken, int yearsOfExperience,
                           float consultationFee, boolean verified) {
        super(userId, name, email, address, password, gender, phoneNumber, dateOfBirth, LocalDate.now(), true);
        LicenseNo = licenseNo;
        Specialization = specialization;
        Qualification = qualification;
        ClinicName = clinicName;
        Bio = bio;
        this.availability = availability;
        LanguageSpoken = languageSpoken;
        YearsOfExperience = yearsOfExperience;
        ConsultationFee = consultationFee;
        this.verified = verified;
    }

    public String getLicenseNo() {
        return LicenseNo;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public String getQualification() {
        return Qualification;
    }

    public String getClinicName() {
        return ClinicName;
    }

    public String getBio() {
        return Bio;
    }

    public String getAvailability() {
        return availability;
    }

    public String getLanguageSpoken() {
        return LanguageSpoken;
    }

    public int getYearsOfExperience() {
        return YearsOfExperience;
    }

    public float getConsultationFee() {
        return ConsultationFee;
    }

    public boolean isVerified() {
        return verified;
    }
    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    public void setClinicName(String clinicName) {
        ClinicName = clinicName;
    }

    public void setBio(String bio) {
        Bio = bio;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public void setLanguageSpoken(String languageSpoken) {
        LanguageSpoken = languageSpoken;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        YearsOfExperience = yearsOfExperience;
    }

    public void setConsultationFee(float consultationFee) {
        ConsultationFee = consultationFee;
    }

    @Override
    public String toString() {
        return "Physiotherapist{" +
                "LicenseNo='" + LicenseNo + '\'' +
                ", Specialization='" + Specialization + '\'' +
                ", Qualification='" + Qualification + '\'' +
                ", ClinicName='" + ClinicName + '\'' +
                ", Bio='" + Bio + '\'' +
                ", availability='" + availability + '\'' +
                ", LanguageSpoken='" + LanguageSpoken + '\'' +
                ", YearsOfExperience=" + YearsOfExperience +
                ", ConsultationFee=" + ConsultationFee +
                ", verified=" + verified +
                '}';
    }
    @Override
    public void showDashboard() {
        System.out.println("=== Physiotherapist dashboard ===");
        System.out.println("Name: " + getName());
        System.out.println("Specialization: " + Specialization);
        System.out.println("Clinic: " + ClinicName);
        System.out.println("Verified: " + verified);
    }
}
