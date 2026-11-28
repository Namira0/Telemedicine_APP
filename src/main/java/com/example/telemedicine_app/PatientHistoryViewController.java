package com.example.telemedicine_app;

import com.example.telemedicine_app.nawrin.MedicalRecord;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PatientHistoryViewController
{
    @javafx.fxml.FXML
    private TableColumn<String, MedicalRecord> medicationTC;
    @javafx.fxml.FXML
    private TextField weightTF;
    @javafx.fxml.FXML
    private TextField heightTF;
    @javafx.fxml.FXML
    private TableColumn<Float, MedicalRecord> WeightTC;
    @javafx.fxml.FXML
    private TableColumn<Float, MedicalRecord> HeightTC;
    @javafx.fxml.FXML
    private ComboBox<String> bloodGroupCB;
    @javafx.fxml.FXML
    private TextField allergiesTF;
    @javafx.fxml.FXML
    private TableView<MedicalRecord> recordTV;
    @javafx.fxml.FXML
    private TableColumn<String, MedicalRecord> patientTC;
    @javafx.fxml.FXML
    private TableColumn<String, MedicalRecord> allergyTC;
    @javafx.fxml.FXML
    private TableColumn<String, MedicalRecord> chronicTC;
    @javafx.fxml.FXML
    private TableColumn<String, MedicalRecord> bloodTC;
    @javafx.fxml.FXML
    private TextField chronicTF;
    @javafx.fxml.FXML
    private TextField medicationsTF;
    @javafx.fxml.FXML
    private TextField patientIdTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadOA(ActionEvent actionEvent) {
    }
}