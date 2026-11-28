package com.example.telemedicine_app;

import com.example.telemedicine_app.nawrin.MedicalRecord;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class DoctorPatientRecordsViewController
{
    @javafx.fxml.FXML
    private TableColumn<String, MedicalRecord> medicationTC;
    @javafx.fxml.FXML
    private TableColumn<String, MedicalRecord> patientTC;
    @javafx.fxml.FXML
    private TableColumn<String, MedicalRecord> allergyTC;
    @javafx.fxml.FXML
    private TableColumn<Float, MedicalRecord> WeightTC;
    @javafx.fxml.FXML
    private TableColumn<String, MedicalRecord> chronicTC;
    @javafx.fxml.FXML
    private TableColumn<Float, MedicalRecord> HeightTC;
    @javafx.fxml.FXML
    private TableColumn<String, MedicalRecord> bloodTC;
    @javafx.fxml.FXML
    private TextField PatientIDTF;
    @javafx.fxml.FXML
    private TableView<MedicalRecord> recordTV;

    @javafx.fxml.FXML
    public void initialize() {
        patientTC.setCellValueFactory(new PropertyValueFactory<>("patientId"));
        bloodTC.setCellValueFactory(new PropertyValueFactory<>("bloodGroup"));
        allergyTC.setCellValueFactory(new PropertyValueFactory<>("allergies"));
        chronicTC.setCellValueFactory(new PropertyValueFactory<>("chronicConditions"));
        medicationTC.setCellValueFactory(new PropertyValueFactory<>("currentMedications"));
        HeightTC.setCellValueFactory(new PropertyValueFactory<>("heightCm"));
        WeightTC.setCellValueFactory(new PropertyValueFactory<>("weightKg"));
    }

    @javafx.fxml.FXML
    public void searchButtonOA(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void nextButtonOA(ActionEvent actionEvent) {
    }
}