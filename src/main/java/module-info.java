module com.example.online_lms {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;


    opens com.example.online_lms to javafx.fxml;
    exports com.example.online_lms;
    exports com.example.online_lms.controllers;
    opens com.example.online_lms.controllers to javafx.fxml;
    exports com.example.online_lms.classes;
    opens com.example.online_lms.classes to javafx.fxml;
}