package com.example.telemedicine_app.common;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public abstract class User {
    private String userId,name,email,address,password,gender;
    private int phoneNumber;
    private LocalDate dateOfBirth, registrationDate;
    private boolean active;

    public User(String userId, String name, String email, String address, String password,
                String gender, int phoneNumber, LocalDate dateOfBirth,
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

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public int getPhoneNumber() {
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
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", dateOfBirth=" + dateOfBirth +
                ", registrationDate=" + registrationDate +
                ", active=" + active +
                '}';
    }
    public boolean login(String email, String password) {
        return active
                && this.email.equalsIgnoreCase(email)
                && this.password.equals(password);
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (!this.password.equals(oldPassword)) {
            throw new IllegalArgumentException("Old password is incorrect");
        }
        if (oldPassword.equals(newPassword)) {
            throw new IllegalArgumentException("New password must be different from the old one");
        }
        setPassword(newPassword);   // runs the strength check
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public void activate() {
        this.active = true;
    }

    public void deactivate() {
        this.active = false;
    }

    public abstract void showDashboard();

    // ---------- Object methods ----------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        return userId.equals(((User) o).userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }
}
