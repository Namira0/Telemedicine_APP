package com.example.telemedicine_app;

import com.example.telemedicine_app.nawrin.Doctor;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.jar.Attributes;

public class PatientFindDoctorViewController
{
    @javafx.fxml.FXML
    private TableColumn<String, Doctor> IdTC;
    @javafx.fxml.FXML
    private TableColumn<String, Doctor> NameTC;
    @javafx.fxml.FXML
    private TableColumn<String, Doctor> SpecializationTC;
    @javafx.fxml.FXML
    private TextField SpecializationTF;
    @javafx.fxml.FXML
    private TableColumn<String, Doctor> experienceTC;
    @javafx.fxml.FXML
    private TableColumn<Float, Doctor> FeeTC;
    @javafx.fxml.FXML
    private TableColumn<String, Doctor> QualificationTC;
    @javafx.fxml.FXML
    private TableView<Doctor> DoctorTV;

    @javafx.fxml.FXML
    public void initialize() {
        IdTC.setCellValueFactory(new PropertyValueFactory<>("DoctorId"));
        NameTC.setCellValueFactory(new PropertyValueFactory<>("Name"));
        SpecializationTC.setCellValueFactory(new PropertyValueFactory<>("Specialization"));
        QualificationTC.setCellValueFactory(new PropertyValueFactory<>("Qualification"));
        FeeTC.setCellValueFactory(new PropertyValueFactory<>("Fee"));
        experienceTC.setCellValueFactory(new PropertyValueFactory<>("Experience"));


    }

    @javafx.fxml.FXML
    public void searchButtonOA(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void bookingOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PatientBookingView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource())
                .getScene().getWindow();

        stage.setScene(scene);
        stage.show();

    }


    @javafx.fxml.FXML
    public void patientDashboardButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("PatientDashboardView.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource())
                .getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }
}