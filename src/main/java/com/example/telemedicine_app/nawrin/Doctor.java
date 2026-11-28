package com.example.telemedicine_app.nawrin;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Doctor extends User {

    private String registrationNumber, specialization, qualifications;
    private int experienceYears;
    private double consultationFee;

    public Doctor(String userId, String phoneNumber, String fullName, String email, double consultationFee, int experienceYears, String qualifications, String registrationNumber, String specialization) {
        super(userId, phoneNumber, fullName, email);
        this.consultationFee = consultationFee;
        this.experienceYears = experienceYears;
        this.qualifications = qualifications;
        this.registrationNumber = registrationNumber;
        this.specialization = specialization;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "consultationFee=" + consultationFee +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", specialization='" + specialization + '\'' +
                ", qualifications='" + qualifications + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }
}
