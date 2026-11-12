package com.example.telemedicine_app.Namira;

import com.example.telemedicine_app.common.User;

import java.time.LocalDate;

public class Physiotherapist extends User {
    private String LicenseNo,Specialization,Qualification,ClinicName,Bio,availability,LanguageSpoken;
    private int YearsOfExperience;
    private float ConsultationFee;
    private boolean verified;

    public Physiotherapist(String userId, String name, String email, String address,
                           String password, String gender, String phoneNumber, LocalDate dateOfBirth,
                           String licenseNo, String specialization, String qualification, String clinicName,
                           String bio, String availability, String languageSpoken, int yearsOfExperience,
                           float consultationFee, boolean verified) {
        super(userId, name, email, address, password, gender, phoneNumber, dateOfBirth, LocalDate.now(), true);
        if (licenseNo == null || licenseNo.isBlank()) {
            throw new IllegalArgumentException("License number cannot be empty");
        }
        LicenseNo = licenseNo.trim();
        setSpecialization(specialization);
        setQualification(qualification);
        ClinicName = clinicName;
        Bio = bio;
        this.availability = availability;
        LanguageSpoken = languageSpoken;
        setYearsOfExperience(yearsOfExperience);
        setConsultationFee(consultationFee);
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
        if (specialization == null || specialization.isBlank()) {
            throw new IllegalArgumentException("Specialization cannot be empty");
        }
        Specialization = specialization.trim();
    }

    public void setQualification(String qualification) {
        if (qualification == null || qualification.isBlank()) {
            throw new IllegalArgumentException("Qualification cannot be empty");
        }
        Qualification = qualification.trim();
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
        if (yearsOfExperience < 0) {
            throw new IllegalArgumentException("Years of experience cannot be negative");
        }
        YearsOfExperience = yearsOfExperience;
    }

    public void setConsultationFee(float consultationFee) {
        if (consultationFee < 0) {
            throw new IllegalArgumentException("Consultation fee cannot be negative");
        }
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
