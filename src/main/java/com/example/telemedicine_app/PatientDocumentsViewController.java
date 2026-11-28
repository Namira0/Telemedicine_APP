package com.example.telemedicine_app;

import com.example.telemedicine_app.nawrin.MedicalDocument;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class PatientDocumentsViewController
{
    @javafx.fxml.FXML
    private TextField patientIdTC;
    @javafx.fxml.FXML
    private TableView<MedicalDocument> documentTV;
    @javafx.fxml.FXML
    private TableColumn<String, MedicalDocument> titleTC;
    @javafx.fxml.FXML
    private TableColumn<String, MedicalDocument> fileTC;
    @javafx.fxml.FXML
    private TextField fileNameTC;
    @javafx.fxml.FXML
    private ComboBox<String> categoryCB;
    @javafx.fxml.FXML
    private TableColumn<String, MedicalDocument> categoryTC;
    @javafx.fxml.FXML
    private DatePicker documentDP;
    @javafx.fxml.FXML
    private TableColumn<String, MedicalDocument> idTC;
    @javafx.fxml.FXML
    private TableColumn<LocalDate, MedicalDocument> dateTC;
    @javafx.fxml.FXML
    private TextField documentIdTC;
    @javafx.fxml.FXML
    private TextField titleTF;

    @javafx.fxml.FXML
    public void initialize() {

        categoryCB.getItems().addAll("Lab Report", "X-Ray", "Prescription", "Other");
        idTC.setCellValueFactory(new PropertyValueFactory<>("documentId"));
        titleTC.setCellValueFactory(new PropertyValueFactory<>("title"));
        categoryTC.setCellValueFactory(new PropertyValueFactory<>("category"));
        fileTC.setCellValueFactory(new PropertyValueFactory<>("fileName"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("documentDate"));
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void nextButtonOA(ActionEvent actionEvent) {
    }
}