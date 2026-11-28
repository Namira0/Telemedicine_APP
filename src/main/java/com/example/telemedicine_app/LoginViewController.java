package com.example.telemedicine_app;

import com.example.telemedicine_app.nawrin.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;

public class LoginViewController
{
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private TextField passwordTF;
    @javafx.fxml.FXML
    private ComboBox<String> loginCB;


    @javafx.fxml.FXML
    public void initialize() {
        loginCB.getItems().addAll("Doctor", "Patient");

    }

    @javafx.fxml.FXML
    public void loginButtonOA(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR);

        String email = emailTF.getText();
        String password = passwordTF.getText();
        String role = loginCB.getValue();

        if (email.isEmpty() || password.isEmpty() || role == null) {
            alert.setContentText("Please fill in all fields");
            alert.showAndWait();
            return;
        }
        String dashboard = "";

        if (role.equals("Patient")) {
            dashboard = "PatientDashboardView.fxml";
        }
        else if (role.equals("Doctor")) {
            dashboard = "DoctorDashboardView.fxml";
        }
        else if (role.equals("Admin")) {
            dashboard = "AdminDashboardView.fxml";
        }
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(
                    getClass().getResource(dashboard)
            );

            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = (Stage) ((Node) actionEvent.getSource())
                    .getScene().getWindow();

            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }


}}

