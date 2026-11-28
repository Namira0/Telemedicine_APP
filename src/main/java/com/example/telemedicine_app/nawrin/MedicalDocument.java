package com.example.telemedicine_app.nawrin;

import java.time.LocalDate;

public class MedicalDocument {
    private String documentId, title, category, fileName, fileType;
    private float fileSizeKb;
    private LocalDate documentDate, uploadDate;

    public MedicalDocument(String category, LocalDate documentDate, String documentId, String fileName, float fileSizeKb, String fileType, String title, LocalDate uploadDate) {
        this.category = category;
        this.documentDate = documentDate;
        this.documentId = documentId;
        this.fileName = fileName;
        this.fileSizeKb = fileSizeKb;
        this.fileType = fileType;
        this.title = title;
        this.uploadDate = uploadDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public float getFileSizeKb() {
        return fileSizeKb;
    }

    public void setFileSizeKb(float fileSizeKb) {
        this.fileSizeKb = fileSizeKb;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDate uploadDate) {
        this.uploadDate = uploadDate;
    }

    @Override
    public String toString() {
        return "MedicalDocument{" +
                "category='" + category + '\'' +
                ", documentId='" + documentId + '\'' +
                ", title='" + title + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                ", fileSizeKb=" + fileSizeKb +
                ", documentDate=" + documentDate +
                ", uploadDate=" + uploadDate +
                '}';
    }
}
