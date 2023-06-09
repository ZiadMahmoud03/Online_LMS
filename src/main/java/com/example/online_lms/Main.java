package com.example.online_lms;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.Month;
import java.util.*;

import static javafx.application.Application.launch;

public class Main extends Application implements Initializable {

    @FXML
    private Button Check_btn;

    @FXML
    private Button FinalRegAccPane_btn;

    @FXML
    private Pane FinalRegAcc_pane;

    @FXML
    private ComboBox<String> Gender_combo;

    @FXML
    private TextField RegCheck;

    @FXML
    private Button RegCreateAcc_btn;

    @FXML
    private TextField RegFirstN;

    @FXML
    private TextField RegLastN;

    @FXML
    private TextField RegNationalID;

    @FXML
    private PasswordField RegPassword;

    @FXML
    private TextField RegPhoneN;

    @FXML
    private TextField RegUserName;

    @FXML
    private Pane createAcc_pane;

    @FXML
    private Button goBack_btn;

    @FXML
    private Button login_btn;

    @FXML
    private Pane login_pane;

    @FXML
    private PasswordField password;

    @FXML
    private Button registerAcc;

    @FXML
    private ComboBox<String> type;

    @FXML
    private TextField userName;

    String[] items = new String[]{"Instructor", "Student"};

    public static void main(String[] args) {
        launch();
    }

    @FXML
    private void login(ActionEvent event) throws IOException {

        try {
            if (((String) this.type.getValue()).equals("Student")) {
                Stage stage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Student.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.centerOnScreen();
                stage.setScene(scene);
                stage.show();
            } else if (((String) this.type.getValue()).equals("Instructor")) {
                Stage stage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Instructor.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.centerOnScreen();
                stage.setScene(scene);
                stage.show();
            }
        } catch(Exception exception) {
            exception.printStackTrace();
            System.out.println(exception.getCause());
        }
    }

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
            Parent root = loader.load();
            Main controller = loader.getController();
            Scene scene = new Scene(root);

            stage.centerOnScreen();

            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getCause());
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.type.getItems().addAll(this.items);
    }

    public void getItems(ActionEvent e) {
        String items = (String)this.type.getValue();
    }
}