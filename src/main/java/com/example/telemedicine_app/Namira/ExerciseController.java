package com.example.telemedicine_app.Namira;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ExerciseController
{
    @javafx.fxml.FXML
    private TableColumn<Boolean,Exercise> completedTableColumn;
    @javafx.fxml.FXML
    private TableColumn<String,Exercise> planIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<String,Exercise> setsTableColumn;
    @javafx.fxml.FXML
    private TableColumn<String,Exercise> repetitionsTableColumn;
    @javafx.fxml.FXML
    private TextArea instructionsTextArea;
    @javafx.fxml.FXML
    private TableColumn<String,Exercise> exercisenameTableColumn;
    @javafx.fxml.FXML
    private TextField planIdTextField;
    @javafx.fxml.FXML
    private TableView<Exercise> exerciseTableView;
    @javafx.fxml.FXML
    private ComboBox<String> excerciseNameComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> repetitionsComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> setsComboBox;
    @javafx.fxml.FXML
    private TableColumn<String,Exercise> exerciseIdTableColumn;
    @javafx.fxml.FXML
    private TextField excersiseIdTextField;

    @javafx.fxml.FXML
    public void initialize() {
        excerciseNameComboBox.getItems().addAll("Glute Bridge","Clam shell","Cat-Cow","Straight Leg Raise"," Calf Raises","Wall Squats","Shoulder External Rotation");
        setsComboBox.getItems().addAll("3 sets", "5 sets","7 sets","10 sets");
        repetitionsComboBox.getItems().addAll("2 reps", "4 reps", "6 reps", "8 reps", "10 reps");
    }

    @javafx.fxml.FXML
    public void backbuttonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addExerciseButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void markCompletedbuttonOA(ActionEvent actionEvent) {
    }
}