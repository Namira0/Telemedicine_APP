package com.example.telemedicine_app;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DoctorPrescriptionViewController
{
    @javafx.fxml.FXML
    private TextField DoctorIdTF;
    @javafx.fxml.FXML
    private TextField prescriptionIdTF;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TextField patientIdTF;
    @javafx.fxml.FXML
    private TextField labTestTF;
    @javafx.fxml.FXML
    private TextField medicineTF;

    @javafx.fxml.FXML
    public void initialize() {
        dateDP.setValue(LocalDate.now());
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveButtonOA(ActionEvent actionEvent) {
    }
}