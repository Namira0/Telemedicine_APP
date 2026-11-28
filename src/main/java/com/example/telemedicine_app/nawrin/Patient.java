package com.example.telemedicine_app.nawrin;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Patient extends User {
    private String gender;
    private LocalDate dob;

    public Patient(String userId, String phoneNumber, String fullName, String email, LocalDate dob, String gender) {
        super(userId, phoneNumber, fullName, email);
        this.dob = dob;
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "dob=" + dob +
                ", gender='" + gender + '\'' +
                '}';
    }
}
