package com.example.telemedicine_app.Namira;

import java.io.Serializable;
import java.time.LocalDate;

public class TherapyRequest implements Serializable {
    private final String requestId;
    private final String patientId;
    private final String physioId;
    private final String doctorId;
    private String therapyType;
    private String reason;
    private String affectedBodyArea;
    private String urgency;
    private LocalDate preferredDate;
    private String status;
    private String declineReason;

    public TherapyRequest(String requestId, String patientId, String physioId, String doctorId,
                          String therapyType, String reason, String affectedBodyArea, String urgency,
                          LocalDate preferredDate, String status, String declineReason) {
        this.requestId = requestId;
        this.patientId = patientId;
        this.physioId = physioId;
        this.doctorId = doctorId;
        this.therapyType = therapyType;
        this.reason = reason;
        this.affectedBodyArea = affectedBodyArea;
        this.urgency = urgency;
        this.preferredDate = preferredDate;
        this.status = status;
        this.declineReason = declineReason;
    }
    public String getRequestId() {
        return requestId;
    }
    public String getPatientId() {
        return patientId;
    }
    public String getPhysioId() {
        return physioId;
    }
    public String getDoctorId() {
        return doctorId;
    }
    public String getTherapyType() {
        return therapyType;
    }
    public String getReason() {
        return reason;
    }
    public String getAffectedBodyArea() {
        return affectedBodyArea;
    }
    public String getUrgency() {
        return urgency;
    }
    public LocalDate getPreferredDate() {
        return preferredDate;
    }
    public String getStatus() {
        return status;
    }
    public String getDeclineReason() {
        return declineReason;
    }
    public void setTherapyType(String therapyType) {
        this.therapyType = therapyType;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public void setAffectedBodyArea(String affectedBodyArea) {
        this.affectedBodyArea = affectedBodyArea;
    }
    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }
    public void setPreferredDate(LocalDate preferredDate) {
        this.preferredDate = preferredDate;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setDeclineReason(String declineReason) {
        this.declineReason = declineReason;
    }
    @Override
    public String toString() {
        return "TherapyRequest{" +
                "requestId='" + requestId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", physioId='" + physioId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", therapyType='" + therapyType + '\'' +
                ", reason='" + reason + '\'' +
                ", affectedBodyArea='" + affectedBodyArea + '\'' +
                ", urgency='" + urgency + '\'' +
                ", preferredDate=" + preferredDate +
                ", status='" + status + '\'' +
                ", declineReason='" + declineReason + '\'' +
                '}';
    }
    public void accept() {
        this.status = "Accepted";
    }
    public void decline(String reason) {
        this.status = "Declined";
        this.declineReason = reason;
    }
}
