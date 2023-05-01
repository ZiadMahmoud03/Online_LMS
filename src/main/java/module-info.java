module com.example.online_lms {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.online_lms to javafx.fxml;
    exports com.example.online_lms;
}