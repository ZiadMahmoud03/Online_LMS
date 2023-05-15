package com.example.online_lms.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class InstructorController implements Initializable{

    @FXML
    private Button Home_btn;

    @FXML
    private AnchorPane Home_pane;

    @FXML
    private Button Logout;

    @FXML
    void logout(ActionEvent event) {
        try {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Warning");
            alert.setHeaderText("Logging Out");
            alert.setContentText("Are you sure you want to Log Out?");
            if (alert.showAndWait().get() == ButtonType.OK) {
                Stage stage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }


        } catch (Exception exception) {
            exception.printStackTrace();
            exception.getCause();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
