package com.example.telemedicine_app.nawrin;

import java.time.LocalDate;

public class Review {
    private String reviewId, comment;
    private int rating;
    private Doctor doctor;
    private LocalDate reviewDate;
    private Patient patient;
    private Consultation consultation;

    public Review(String comment, Consultation consultation, Doctor doctor, Patient patient, int rating, LocalDate reviewDate, String reviewId) {
        this.comment = comment;
        this.consultation = consultation;
        this.doctor = doctor;
        this.patient = patient;
        this.rating = rating;
        this.reviewDate = reviewDate;
        this.reviewId = reviewId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    @Override
    public String toString() {
        return "Review{" +
                "comment='" + comment + '\'' +
                ", reviewId='" + reviewId + '\'' +
                ", rating=" + rating +
                ", doctor=" + doctor +
                ", reviewDate=" + reviewDate +
                ", patient=" + patient +
                ", consultation=" + consultation +
                '}';
    }
}
