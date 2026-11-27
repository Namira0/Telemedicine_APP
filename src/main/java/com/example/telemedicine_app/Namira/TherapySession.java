package com.example.telemedicine_app.Namira;
import java.io.Serializable;
import java.time.LocalDate;

public class TherapySession implements Serializable {
    private String sessionId;
    private String requestId;
    private String status;
    private LocalDate sessionDate;
    private int startTime;
    private int durationInMin;
    private String meetingLink;
    private String consultationNotes;
    private String therapyInstructions;
    private String cancelReason;

    public TherapySession(String sessionId, String requestId,
                          String status, LocalDate sessionDate, int startTime,
                          int durationInMin, String meetingLink,
                          String consultationNotes, String therapyInstructions,
                          String cancelReason) {;
        this.sessionId = sessionId;
        this.requestId = requestId;
        this.status = status;
        this.sessionDate = sessionDate;
        this.startTime = startTime;
        this.durationInMin = durationInMin;
        this.meetingLink = meetingLink;
        this.consultationNotes = consultationNotes;
        this.therapyInstructions = therapyInstructions;
        this.cancelReason = cancelReason;
    }
    public String getSessionId() {
        return sessionId;
    }
    public String getRequestId() {
        return requestId;
    }
    public String getStatus() {
        return status;
    }
    public LocalDate getSessionDate() {
        return sessionDate;
    }
    public int getStartTime() {
        return startTime;
    }
    public int getDurationInMin() {
        return durationInMin;
    }
    public String getMeetingLink() {
        return meetingLink;
    }
    public String getConsultationNotes() {
        return consultationNotes;
    }
    public String getTherapyInstructions() {
        return therapyInstructions;
    }
    public String getCancelReason() {
        return cancelReason;
    }
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setSessionDate(LocalDate sessionDate) {
        this.sessionDate = sessionDate;
    }
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }
    public void setDurationInMin(int durationInMin) {
        this.durationInMin = durationInMin;
    }
    public void setMeetingLink(String meetingLink) {
        this.meetingLink = meetingLink;
    }
    public void setConsultationNotes(String consultationNotes) {
        this.consultationNotes = consultationNotes;
    }
    public void setTherapyInstructions(String therapyInstructions) {
        this.therapyInstructions = therapyInstructions;
    }
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }
    @Override
    public String toString() {
        return "TherapySession{" +
                "sessionId='" + sessionId + '\'' +
                ", requestId='" + requestId + '\'' +
                ", status='" + status + '\'' +
                ", sessionDate=" + sessionDate +
                ", startTime=" + startTime +
                ", durationInMin=" + durationInMin +
                ", meetingLink='" + meetingLink + '\'' +
                ", consultationNotes='" + consultationNotes + '\'' +
                ", therapyInstructions='" + therapyInstructions + '\'' +
                ", cancelReason='" + cancelReason + '\'' +
                '}';
    }
    public void cancel(String reason) {
        this.status = "Cancelled";
        this.cancelReason = reason;
    }
    public void reschedule(LocalDate newDate, int newTime) {
        this.sessionDate = newDate;
        this.startTime = newTime;
        this.status = "Scheduled";
    }
    public void complete() {
        this.status = "Completed";
    }
}
