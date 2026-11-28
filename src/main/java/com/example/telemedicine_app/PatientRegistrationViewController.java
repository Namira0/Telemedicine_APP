package com.example.telemedicine_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PatientRegistrationViewController
{
    @javafx.fxml.FXML
    private TextField FullNameTF;
    @javafx.fxml.FXML
    private ComboBox<String> genderCB;
    @javafx.fxml.FXML
    private DatePicker dobDP;
    @javafx.fxml.FXML
    private TextField PhoneNumberTF;
    @javafx.fxml.FXML
    private TextField EmailTF;
    @javafx.fxml.FXML
    private TextField UserIdTF;

    @javafx.fxml.FXML
    public void initialize() {
        genderCB.getItems().addAll("Female", "Male");
    }

    @javafx.fxml.FXML
    public void RegisterOA(ActionEvent actionEvent) throws IOException {


            FXMLLoader fxmlLoader = new FXMLLoader(
                    getClass().getResource("PatientDashboardView.fxml")
            );

            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();


    }


}