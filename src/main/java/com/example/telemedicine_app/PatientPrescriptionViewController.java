package com.example.telemedicine_app;

import com.example.telemedicine_app.nawrin.Prescription;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class PatientPrescriptionViewController
{
    @javafx.fxml.FXML
    private TableColumn<String, Prescription> doctorTC;
    @javafx.fxml.FXML
    private TableColumn<String, Prescription> labTC;
    @javafx.fxml.FXML
    private TableView prescriptionTV;
    @javafx.fxml.FXML
    private TableColumn<String, Prescription> idTC;
    @javafx.fxml.FXML
    private TableColumn<String, Prescription> medicinesTC;
    @javafx.fxml.FXML
    private TableColumn<LocalDate, Prescription> dateTC;
    @javafx.fxml.FXML
    private TextField patientIdTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loadButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {
    }
}