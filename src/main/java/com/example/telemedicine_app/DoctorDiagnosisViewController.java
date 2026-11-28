package com.example.telemedicine_app;

import com.example.telemedicine_app.nawrin.Diagnosis;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class DoctorDiagnosisViewController
{
    @javafx.fxml.FXML
    private TableColumn <Integer, Diagnosis> pulseTC;
    @javafx.fxml.FXML
    private TextField diastolicBpTF;
    @javafx.fxml.FXML
    private TableColumn<String, Diagnosis> diastolicTC;
    @javafx.fxml.FXML
    private TextField chiefComplaintsTF;
    @javafx.fxml.FXML
    private TableView<Diagnosis> DiagnosisTV;
    @javafx.fxml.FXML
    private TableColumn<Integer, Diagnosis> systolicTC;
    @javafx.fxml.FXML
    private TextField consultationIdTF;
    @javafx.fxml.FXML
    private TableColumn<String, Diagnosis> patientTC;
    @javafx.fxml.FXML
    private DatePicker finalizedDateDP;
    @javafx.fxml.FXML
    private TextField primaryDiagnosisTF;
    @javafx.fxml.FXML
    private TextField systolicBpTF;
    @javafx.fxml.FXML
    private TextField patientIdTF;
    @javafx.fxml.FXML
    private TextField pulseRateTF;
    @javafx.fxml.FXML
    private TableColumn<String, Diagnosis> diagnosisTC;
    @javafx.fxml.FXML
    private TableColumn<LocalDate, Diagnosis> dateTC;

    @javafx.fxml.FXML
    public void initialize() {
        patientTC.setCellValueFactory(new PropertyValueFactory<>("patientId"));
        diagnosisTC.setCellValueFactory(new PropertyValueFactory<>("primaryDiagnosis"));
        systolicTC.setCellValueFactory(new PropertyValueFactory<>("systolicBp"));
        diastolicTC.setCellValueFactory(new PropertyValueFactory<>("diastolicBp"));
        pulseTC.setCellValueFactory(new PropertyValueFactory<>("pulseRate"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("finalizedDate"));


    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void saveButtonOA(ActionEvent actionEvent) {

    }

}