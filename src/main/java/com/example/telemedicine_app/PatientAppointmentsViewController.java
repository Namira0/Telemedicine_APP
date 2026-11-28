package com.example.telemedicine_app;

import com.example.telemedicine_app.nawrin.Appointment;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class PatientAppointmentsViewController
{
    @javafx.fxml.FXML
    private TableColumn<String, Appointment> timeTC;
    @javafx.fxml.FXML
    private TableColumn<Appointment, String> statusTC;
    @javafx.fxml.FXML
    private TableColumn<String, Appointment> reasonTC;
    @javafx.fxml.FXML
    private TableColumn<String, Appointment> idTC;
    @javafx.fxml.FXML
    private TableColumn<LocalDate, Appointment> dateTC;
    @javafx.fxml.FXML
    private TextField patientIdTF;
    @javafx.fxml.FXML
    private TableView<Appointment> appointmentTV;
    @javafx.fxml.FXML
    private TextField appointmentIdTF;
    @javafx.fxml.FXML
    private TableColumn<String, Appointment> doctorTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loadButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void cancelButtonOA(ActionEvent actionEvent) {
    }
}