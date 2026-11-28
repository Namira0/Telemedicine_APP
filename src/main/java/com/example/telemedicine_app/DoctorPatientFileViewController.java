package com.example.telemedicine_app;

import com.example.telemedicine_app.nawrin.MedicalDocument;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class DoctorPatientFileViewController
{
    @javafx.fxml.FXML
    private TableColumn<MedicalDocument, String> fileTC;
    @javafx.fxml.FXML
    private TextField documentIdTF;
    @javafx.fxml.FXML
    private TableColumn<MedicalDocument, String> typeTC;
    @javafx.fxml.FXML
    private TableColumn<MedicalDocument, String> categoryTC;
    @javafx.fxml.FXML
    private TableColumn<MedicalDocument, Float> sizeTC;
    @javafx.fxml.FXML
    private TableColumn<MedicalDocument, String> titleTC;
    @javafx.fxml.FXML
    private Label selectFileLabel;
    @javafx.fxml.FXML
    private TableColumn<MedicalDocument, LocalDate> updateDateTC;
    @javafx.fxml.FXML
    private TextField doctorIdTF;
    @javafx.fxml.FXML
    private ComboBox<String> categoryCB;
    @javafx.fxml.FXML
    private TableColumn<MedicalDocument, String> idTC;
    @javafx.fxml.FXML
    private TextField titleTF;
    @javafx.fxml.FXML
    private TableColumn<MedicalDocument, LocalDate> docDateTC;
    @javafx.fxml.FXML
    private TableView<MedicalDocument> sharedTV;
    @javafx.fxml.FXML
    private ComboBox<String> patientCB;







    @javafx.fxml.FXML
    public void initialize() {
        patientCB.setEditable(true);
        categoryCB.getItems().addAll("Lab Report", "X-Ray / Image", "Prescription", "Other");

        idTC.setCellValueFactory(new PropertyValueFactory<>("documentId"));
        titleTC.setCellValueFactory(new PropertyValueFactory<>("title"));
        categoryTC.setCellValueFactory(new PropertyValueFactory<>("category"));
        fileTC.setCellValueFactory(new PropertyValueFactory<>("fileName"));
        typeTC.setCellValueFactory(new PropertyValueFactory<>("type"));
        sizeTC.setCellValueFactory(new PropertyValueFactory<>("fileSizeKb"));
        docDateTC.setCellValueFactory(new PropertyValueFactory<>("documentDate"));
        updateDateTC.setCellValueFactory(new PropertyValueFactory<>("updateDate"));



    }

    @javafx.fxml.FXML
    public void LoadFilesOA(ActionEvent actionEvent) {
        patientCB.getItems().clear();


    }

    @javafx.fxml.FXML
    public void DownloadOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sendFileOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openOA(ActionEvent actionEvent) {
    }
}