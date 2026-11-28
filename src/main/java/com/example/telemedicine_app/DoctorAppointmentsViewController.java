package com.example.telemedicine_app;

import com.example.telemedicine_app.nawrin.Appointment;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class DoctorAppointmentsViewController
{
    @javafx.fxml.FXML
    private TextField appointIdTF;
    @javafx.fxml.FXML
    private TextField rejCommentTF;
    @javafx.fxml.FXML
    private TextField docTF;
    @javafx.fxml.FXML
    private TableColumn<String, Appointment> timeTC;
    @javafx.fxml.FXML
    private TableColumn<String, Appointment> patientTC;
    @javafx.fxml.FXML
    private TableColumn<String, Appointment> ComplaintTC;
    @javafx.fxml.FXML
    private ComboBox<String> statusCB;
    @javafx.fxml.FXML
    private TableColumn<String, Appointment> statusTC;
    @javafx.fxml.FXML
    private TableColumn<String, Appointment> idTC;
    @javafx.fxml.FXML
    private TableColumn<LocalDate, Appointment> dateTC;
    @javafx.fxml.FXML
    private TableView<Appointment> appointmentTV;

    @javafx.fxml.FXML
    public void initialize() {
        statusCB.getItems().addAll("Accepted", "Rejected", "Completed");
        idTC.setCellValueFactory(new PropertyValueFactory<>("appointmentId"));
        patientTC.setCellValueFactory(new PropertyValueFactory<>("patientId"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeTC.setCellValueFactory(new PropertyValueFactory<>("time"));
        ComplaintTC.setCellValueFactory(new PropertyValueFactory<>("Complaint"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void SubmitButtonOA(ActionEvent actionEvent) {


    }


    @javafx.fxml.FXML
    public void loadButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {
    }
}