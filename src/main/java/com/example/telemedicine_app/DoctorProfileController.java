package com.example.telemedicine_app;

import com.example.telemedicine_app.nawrin.Doctor;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class DoctorProfileController
{
    @javafx.fxml.FXML
    private TextField userIdTF;
    @javafx.fxml.FXML
    private TextField specializationTF;
    @javafx.fxml.FXML
    private TextField regNumTF;
    @javafx.fxml.FXML
    private TextField fullnameTF;
    @javafx.fxml.FXML
    private TableColumn<String, Doctor> nameTC;
    @javafx.fxml.FXML
    private TableColumn<String, Doctor> specializationTC;
    @javafx.fxml.FXML
    private TextField experienceTF;
    @javafx.fxml.FXML
    private TableColumn<String, Doctor> experienceTC;
    @javafx.fxml.FXML
    private TextField qualificationTF;
    @javafx.fxml.FXML
    private TableView<Doctor> docTV;
    @javafx.fxml.FXML
    private TextField phoneNumTF;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private TextField feeTF;
    @javafx.fxml.FXML
    private TableColumn<String, Doctor> idTC;
    @javafx.fxml.FXML
    private TableColumn<Float, Doctor> feeTC;

    @javafx.fxml.FXML
    public void initialize() {
        idTC.setCellValueFactory(new PropertyValueFactory<>("userId"));
        nameTC.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        specializationTC.setCellValueFactory(new PropertyValueFactory<>("specialization"));
        experienceTC.setCellValueFactory(new PropertyValueFactory<>("experienceYears"));
        feeTC.setCellValueFactory(new PropertyValueFactory<>("fee"));


    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {


    }

    @javafx.fxml.FXML
    public void saveButtonOA(ActionEvent actionEvent)  {


    }
}