package com.example.telemedicine_app.Radiologist;

public class ManageProfileAndChangePassword {
    private String radiologistId;
    private String fullName;
    private String email;
    private String password;

    public ManageProfileAndChangePassword(String radiologistId, String fullName, String email, String password) {
        this.radiologistId = radiologistId;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    public String getRadiologistId() {
        return radiologistId;
    }

    public void setRadiologistId(String radiologistId) {
        this.radiologistId = radiologistId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ManageProfileAndChangePassword{" +
                "radiologistId='" + radiologistId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
