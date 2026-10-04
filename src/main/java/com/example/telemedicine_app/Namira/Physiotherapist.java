package com.example.telemedicine_app.Namira;

public class Physiotherapist {
    private String physiotherapistId;
    private String name;
    private String specialization;
    private String contactNumber;
    private String email;

    public String getPhysiotherapistId() {
        return physiotherapistId;
    }

    public void setPhysiotherapistId(String physiotherapistId) {
        this.physiotherapistId = physiotherapistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Physiotherapist(String physiotherapistId, String name, String specialization, String contactnumber, String email) {
        this.physiotherapistId = physiotherapistId;
        this.name = name;
        this.specialization = specialization;
        this.contactNumber = contactnumber;
        this.email = email;
    }
}
