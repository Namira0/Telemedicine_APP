package com.example.telemedicine_app;

import com.example.telemedicine_app.nawrin.Consultation;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PatientConsultationViewController
{
    @javafx.fxml.FXML
    private TableView<Consultation> consultationTV;
    @javafx.fxml.FXML
    private TableColumn<String, Consultation> endTC;
    @javafx.fxml.FXML
    private TableColumn<String, Consultation> chatLogTC;
    @javafx.fxml.FXML
    private TextField doctorIdTF;
    @javafx.fxml.FXML
    private TableColumn<String, Consultation> startTC;
    @javafx.fxml.FXML
    private TableColumn<String, Consultation> idTC;
    @javafx.fxml.FXML
    private TableColumn<String, Consultation> dateTC;
    @javafx.fxml.FXML
    private TextField patientIdTF;
    @javafx.fxml.FXML
    private TableColumn<String, Consultation> doctorTC;
    @javafx.fxml.FXML
    private TextField commentTF;
    @javafx.fxml.FXML
    private ComboBox<Integer> ratingCB;

    @javafx.fxml.FXML
    public void initialize() {
        ratingCB.getItems().addAll(1, 2, 3, 4, 5);
        idTC.setCellValueFactory(new PropertyValueFactory<>("consultationId"));
        doctorTC.setCellValueFactory(new PropertyValueFactory<>("doctorId"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
        startTC.setCellValueFactory(new PropertyValueFactory<>("startTime"));
        endTC.setCellValueFactory(new PropertyValueFactory<>("endTime"));
        chatLogTC.setCellValueFactory(new PropertyValueFactory<>("chatLog"));
    }

    @javafx.fxml.FXML
    public void loadButtonOA(ActionEvent actionEvent) {
    }



    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reviewButtonOA(ActionEvent actionEvent) {
    }
}