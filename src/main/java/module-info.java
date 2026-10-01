module com.example.telemedicine_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.telemedicine_app to javafx.fxml;
    exports com.example.telemedicine_app;
}