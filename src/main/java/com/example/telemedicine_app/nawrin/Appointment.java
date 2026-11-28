package com.example.telemedicine_app.nawrin;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Appointment {
    private String appointmentId, chiefComplaint, symptomDuration, status, rejectionReason, rejectionComment, cancellationReason, preConsultationNote, followUpPurpose;
    private Doctor doctor;
    private Patient patient;
    private LocalDate date;
    private LocalTime time;
    private LocalDateTime holdExpiry;
    private Payment payment;
    private Consultation consultation;
    private Consultation originalConsultation;
    private ArrayList<MedicalDocument> attachedDocuments;

    public Appointment(String appointmentId, ArrayList<MedicalDocument> attachedDocuments, String cancellationReason, String chiefComplaint, Consultation consultation, LocalDate date, Doctor doctor, String followUpPurpose, LocalDateTime holdExpiry, Consultation originalConsultation, Patient patient, Payment payment, String preConsultationNote, String rejectionComment, String rejectionReason, String status, String symptomDuration, LocalTime time) {
        this.appointmentId = appointmentId;
        this.attachedDocuments = attachedDocuments;
        this.cancellationReason = cancellationReason;
        this.chiefComplaint = chiefComplaint;
        this.consultation = consultation;
        this.date = date;
        this.doctor = doctor;
        this.followUpPurpose = followUpPurpose;
        this.holdExpiry = holdExpiry;
        this.originalConsultation = originalConsultation;
        this.patient = patient;
        this.payment = payment;
        this.preConsultationNote = preConsultationNote;
        this.rejectionComment = rejectionComment;
        this.rejectionReason = rejectionReason;
        this.status = status;
        this.symptomDuration = symptomDuration;
        this.time = time;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public ArrayList<MedicalDocument> getAttachedDocuments() {
        return attachedDocuments;
    }

    public void setAttachedDocuments(ArrayList<MedicalDocument> attachedDocuments) {
        this.attachedDocuments = attachedDocuments;
    }

    public String getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getFollowUpPurpose() {
        return followUpPurpose;
    }

    public void setFollowUpPurpose(String followUpPurpose) {
        this.followUpPurpose = followUpPurpose;
    }

    public LocalDateTime getHoldExpiry() {
        return holdExpiry;
    }

    public void setHoldExpiry(LocalDateTime holdExpiry) {
        this.holdExpiry = holdExpiry;
    }

    public Consultation getOriginalConsultation() {
        return originalConsultation;
    }

    public void setOriginalConsultation(Consultation originalConsultation) {
        this.originalConsultation = originalConsultation;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getPreConsultationNote() {
        return preConsultationNote;
    }

    public void setPreConsultationNote(String preConsultationNote) {
        this.preConsultationNote = preConsultationNote;
    }

    public String getRejectionComment() {
        return rejectionComment;
    }

    public void setRejectionComment(String rejectionComment) {
        this.rejectionComment = rejectionComment;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSymptomDuration() {
        return symptomDuration;
    }

    public void setSymptomDuration(String symptomDuration) {
        this.symptomDuration = symptomDuration;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId='" + appointmentId + '\'' +
                ", chiefComplaint='" + chiefComplaint + '\'' +
                ", symptomDuration='" + symptomDuration + '\'' +
                ", status='" + status + '\'' +
                ", rejectionReason='" + rejectionReason + '\'' +
                ", rejectionComment='" + rejectionComment + '\'' +
                ", cancellationReason='" + cancellationReason + '\'' +
                ", preConsultationNote='" + preConsultationNote + '\'' +
                ", followUpPurpose='" + followUpPurpose + '\'' +
                ", doctor=" + doctor +
                ", patient=" + patient +
                ", date=" + date +
                ", time=" + time +
                ", holdExpiry=" + holdExpiry +
                ", payment=" + payment +
                ", consultation=" + consultation +
                ", originalConsultation=" + originalConsultation +
                ", attachedDocuments=" + attachedDocuments +
                '}';
    }
}
