package com.example.telemedicine_app.Namira;

import com.example.telemedicine_app.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class ExerciseController
{
    @javafx.fxml.FXML
    private TableColumn<Exercise,Boolean> completedTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Exercise,String> planIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Exercise,Integer> setsTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Exercise,Integer> repetitionsTableColumn;
    @javafx.fxml.FXML
    private TextArea instructionsTextArea;
    @javafx.fxml.FXML
    private TableColumn<Exercise,String> exercisenameTableColumn;
    @javafx.fxml.FXML
    private TextField planIdTextField;
    @javafx.fxml.FXML
    private TableView<Exercise> exerciseTableView;
    @javafx.fxml.FXML
    private ComboBox<String> excerciseNameComboBox;
    @javafx.fxml.FXML
    private ComboBox<Integer> repetitionsComboBox;
    @javafx.fxml.FXML
    private ComboBox<Integer> setsComboBox;
    @javafx.fxml.FXML
    private TableColumn<Exercise,String> exerciseIdTableColumn;
    @javafx.fxml.FXML
    private TextField excersiseIdTextField;

    private ArrayList<Exercise> exerciseList = new ArrayList<Exercise>();

    @javafx.fxml.FXML
    public void initialize() {
        excerciseNameComboBox.getItems().addAll("Glute Bridge","Clam shell","Cat-Cow","Straight Leg Raise"," CalfRaises","Wall Squats","Shoulder External Rotation");
        setsComboBox.getItems().addAll(3,5,7,10);
        repetitionsComboBox.getItems().addAll(2, 4, 6, 8, 10);
        planIdTableColumn.setCellValueFactory(new PropertyValueFactory<Exercise,String>("planId"));
        exercisenameTableColumn.setCellValueFactory(new PropertyValueFactory<Exercise,String>("ExerciseName"));
        setsTableColumn.setCellValueFactory(new PropertyValueFactory<Exercise,Integer>("sets"));
        repetitionsTableColumn.setCellValueFactory(new PropertyValueFactory<Exercise, Integer>("repetitions"));
        completedTableColumn.setCellValueFactory(new PropertyValueFactory<Exercise,Boolean>("completed"));
        exerciseIdTableColumn.setCellValueFactory(new PropertyValueFactory<Exercise,String>("exerciseId"));

        readFromFile();
        showExercises();

    }
    private void readFromFile(){
        exerciseList.clear();
        File f = new File("Exercise.bin");
        ObjectInputStream ois = null;
        try {
            if (f.exists()){
                ois = new ObjectInputStream(new FileInputStream(f));
                while (true){
                    exerciseList.add((Exercise) ois.readObject());
                }
            }
        } catch (Exception e) {

        }
        try { if( ois != null) ois.close(); }catch (Exception e2){ }

    }
    private void saveToFile(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Exercise.bin"));
            for (Exercise e : exerciseList) {
                oos.writeObject(e);
            }
            oos.close();
        }catch (Exception e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("File Could not Save");
            a.showAndWait();
        }
    }
    public void showExercises(){
        exerciseTableView.getItems().clear();
        for (Exercise e : exerciseList){
            exerciseTableView.getItems().add(e);
        }
    }
    private boolean isValid(){
        if (excersiseIdTextField.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please enter the exercise Id");
            a.showAndWait();
            return false;
        }
        if (planIdTextField.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please enter the plan Id");
            a.showAndWait();
            return false;
        }
        if (excerciseNameComboBox.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select an exercise");
            a.showAndWait();
            return false;
        }
        if (setsComboBox.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select the number of sets");
            a.showAndWait();
            return false;
        }
        if (repetitionsComboBox.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select the number of repetitions");
            a.showAndWait();
            return false;
        }
        return true;
    }

    @javafx.fxml.FXML
    public void backbuttonOA(ActionEvent actionEvent) {
        try {
            FXMLLoader myFxmlLoader =
                    new FXMLLoader(HelloApplication.class.getResource("ExerciseDashboard.fxml"));
            Scene nextScene = new Scene(myFxmlLoader.load());
            Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(nextScene);
            currentStage.show();
        } catch (Exception e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("There's error, Dashboard could not open");
            a.showAndWait();

        }
    }

    @javafx.fxml.FXML
    public void addExerciseButtonOA(ActionEvent actionEvent) {
        if (!isValid()){
            //Alert a = new Alert(Alert.AlertType.ERROR);
            //a.setContentText("Fields can not be empty please fill up all the fields");
            //a.showAndWait();
            return;
        }
        for (Exercise e : exerciseList){
            if (e.getExerciseId().equals(excersiseIdTextField.getText())){
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("This exercise Id already exist");
                a.showAndWait();
                return;
            }
        }
        Exercise newExercise = new Exercise(
                excersiseIdTextField.getText(),
                planIdTextField.getText(),
                excerciseNameComboBox.getValue(),
                instructionsTextArea.getText(),
                setsComboBox.getValue(),
                repetitionsComboBox.getValue()
        );
        exerciseList.add(newExercise);
        saveToFile();
        showExercises();


        excersiseIdTextField.clear();
        planIdTextField.clear();
        instructionsTextArea.clear();
        excerciseNameComboBox.setValue(null);
        setsComboBox.setValue(null);
        repetitionsComboBox.setValue(null);
    }

    @javafx.fxml.FXML
    public void markCompletedbuttonOA(ActionEvent actionEvent) {
        Exercise selected = exerciseTableView.getSelectionModel().getSelectedItem();
        if (selected == null){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("please select an exercise from the table");
            a.showAndWait();
            return;
        }
        selected.markCompleted();
        saveToFile();
        showExercises();
    }
}