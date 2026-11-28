package com.example.telemedicine_app;

import com.example.telemedicine_app.nawrin.Consultation;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class DoctorConsultationViewController
{

    @javafx.fxml.FXML
    private TableView<Consultation> consultationTV;
    @javafx.fxml.FXML
    private TableColumn<String, Consultation> endTC;
    @javafx.fxml.FXML
    private TableColumn<LocalDate, Consultation> dateTC;
    @javafx.fxml.FXML
    private TextField endTF;
    @javafx.fxml.FXML
    private TextField consultationIdTF;
    @javafx.fxml.FXML
    private TextField doctorIdTF;
    @javafx.fxml.FXML
    private TableColumn<String, Consultation> startTC;
    @javafx.fxml.FXML
    private TableColumn<String, Consultation> idTC;
    @javafx.fxml.FXML
    private TextField chatLogTF;
    @javafx.fxml.FXML
    private TextField patientIdTF;
    @javafx.fxml.FXML
    private TextField appointmentIdTF;
    @javafx.fxml.FXML
    private TextField startTF;
    @javafx.fxml.FXML
    private TableColumn<String, Consultation> appointTC;
    @javafx.fxml.FXML
    private TableColumn<String, Consultation> patientTC;

    @javafx.fxml.FXML
    public void initialize() {

        idTC.setCellValueFactory(new PropertyValueFactory<>("consultationId"));
        appointTC.setCellValueFactory(new PropertyValueFactory<>("appointmentId"));
        patientTC.setCellValueFactory(new PropertyValueFactory<>("patientId"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
        startTC.setCellValueFactory(new PropertyValueFactory<>("startTime"));
        endTC.setCellValueFactory(new PropertyValueFactory<>("endTime"));
    }

    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) {
    }
}