package com.example.telemedicine_app;

import com.example.telemedicine_app.nawrin.User;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class LoginViewController
{
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private TextField passwordTF;
    @javafx.fxml.FXML
    private ComboBox<String> loginCB;

    ArrayList<User> UserList = new ArrayList<>();

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

        if (!email.contains("@") || !email.contains(".")) {
            alert.setContentText("Enter a valid email address");
            alert.showAndWait();
            return;
        }
        if (password.length() < 6) {
            alert.setContentText("Password must be at least 6 characters");
            alert.showAndWait();
            return;
        }
        alert.setAlertType(Alert.AlertType.INFORMATION);
        alert.setContentText("Login validation successful");
        alert.showAndWait();
    }


}

