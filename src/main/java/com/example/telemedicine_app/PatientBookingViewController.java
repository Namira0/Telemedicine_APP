package com.example.telemedicine_app;

import com.example.telemedicine_app.nawrin.ScheduleSession;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class PatientBookingViewController
{
    @javafx.fxml.FXML
    private TextField chiefComplaintTF;
    @javafx.fxml.FXML
    private ComboBox<String> doctorCB;
    @javafx.fxml.FXML
    private TableColumn<String, ScheduleSession> dayTC;
    @javafx.fxml.FXML
    private TextField patientId;
    @javafx.fxml.FXML
    private TableColumn<String, ScheduleSession> endTC;
    @javafx.fxml.FXML
    private TextField AppointmentIdTF;
    @javafx.fxml.FXML
    private TableColumn<String,ScheduleSession> startTC;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TextField symptomDurationTF;
    @javafx.fxml.FXML
    private TextField TimeTF;
    @javafx.fxml.FXML
    private TableColumn<String, ScheduleSession> doctorIdTC;
    @javafx.fxml.FXML
    private TableView<ScheduleSession> scheduleTV;

    @javafx.fxml.FXML
    public void initialize() {
        doctorIdTC.setCellValueFactory(new PropertyValueFactory<>("doctorId"));
        dayTC.setCellValueFactory(new PropertyValueFactory<>("dayOfWeek"));
        startTC.setCellValueFactory(new PropertyValueFactory<>("startTime"));
        endTC.setCellValueFactory(new PropertyValueFactory<>("endTime"));

    }

    @javafx.fxml.FXML
    public void bookButtonOA(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PatientAppointmentsView.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();


    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PatientFindDoctorView.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();



    }
}