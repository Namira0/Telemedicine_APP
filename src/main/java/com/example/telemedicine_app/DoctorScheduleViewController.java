package com.example.telemedicine_app;

import com.example.telemedicine_app.nawrin.ScheduleSession;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class DoctorScheduleViewController
{
    @javafx.fxml.FXML
    private TableColumn<String, ScheduleSession> dayTC;
    @javafx.fxml.FXML
    private TableView<ScheduleSession> scheduleTV;
    @javafx.fxml.FXML
    private TableColumn<String, ScheduleSession> endTC;
    @javafx.fxml.FXML
    private TextField docIdTF;
    @javafx.fxml.FXML
    private TextField maxPatientTF;
    @javafx.fxml.FXML
    private TableColumn<String, ScheduleSession> docIdTC;
    @javafx.fxml.FXML
    private TextField endTF;
    @javafx.fxml.FXML
    private TextField startTF;
    @javafx.fxml.FXML
    private TableColumn<String, ScheduleSession> maxPatientTC;
    @javafx.fxml.FXML
    private ComboBox<String> dayCB;
    @javafx.fxml.FXML
    private TableColumn<String, ScheduleSession> startTC;

    @javafx.fxml.FXML
    public void initialize() {
        dayCB.getItems().addAll("Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday");
        docIdTC.setCellValueFactory(new PropertyValueFactory<>("doctorId"));
        dayTC.setCellValueFactory(new PropertyValueFactory<>("dayOfWeek"));
        startTC.setCellValueFactory(new PropertyValueFactory<>("startTime"));
        endTC.setCellValueFactory(new PropertyValueFactory<>("endTime"));
        maxPatientTC.setCellValueFactory(new PropertyValueFactory<>("maxPatients"));
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void saveButtonOA(ActionEvent actionEvent) {
    }
}