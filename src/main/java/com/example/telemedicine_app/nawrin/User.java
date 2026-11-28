package com.example.telemedicine_app.nawrin;

public abstract class User {
    final private String userId;
    private String fullName, email, phoneNumber;

    public User(String userId, String phoneNumber, String fullName, String email) {
        this.userId = userId;
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", userId='" + userId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
