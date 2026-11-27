package com.example.telemedicine_app.common;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class User implements Serializable {
    private final String userId;
    private final String name;
    private final String gender;
    private final LocalDate dateOfBirth;
    private final LocalDate registrationDate;
    private String email;
    private String address;
    private String password;
    private String phoneNumber;
    private boolean active;
    public User(String userId, String name, String email, String address, String password,
                String gender, String phoneNumber, LocalDate dateOfBirth,
                LocalDate registrationDate, boolean active) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.password = password;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.registrationDate = registrationDate;
        this.active = active;
    }
    public String getUserId() {
        return userId;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    public String getPassword() {
        return password;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }
    public boolean isActive() {
        return active;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", registrationDate=" + registrationDate +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", active=" + active +
                '}';
    }
    public boolean login(String emailOrPhoneNumber, String password) {
        if (this.active
                && (this.email.equals(emailOrPhoneNumber) || this.phoneNumber.equals(emailOrPhoneNumber))
                && this.password.equals(password)) {
            return true;
        }
        return false;
    }
    public String changePassword(String oldPassword, String newPassword){
        if (this.password.equals(oldPassword)){
            this.password = newPassword;
            return "Password changed successfully, Go back to login page";
        }
        return "Old Password is wrong";
    }
    public static String checkDateOfBirth(LocalDate date){
        if (date == null){
            return "Birth Date can not be empty";
        }
        if (date.isAfter(LocalDate.now())){
            return " Birth date Can not be future date";
        }
        return "";
    }
    public int getAge() {
        return LocalDate.now().getYear() - this.dateOfBirth.getYear();
    }
    public void activate() { this.active = true; }
    public void deactivate() { this.active = false; }

    public abstract void showDashboard();
}
