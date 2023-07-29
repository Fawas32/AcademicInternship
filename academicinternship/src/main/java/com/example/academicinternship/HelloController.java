package com.example.academicinternship;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Button Btn1;

    DataSingleton data = DataSingleton.getInstance();

    @FXML

    void submit(ActionEvent event) throws IOException{

        data.setUserName(Btn1.getText());

        Stage stage = (Stage) Btn1.getScene().getWindow();
        Parent root = FXMLLoader.load((getClass().getResource("hello-view.fxml")));
        stage.setTitle("hello-view.fxml");
        stage.setScene(new Scene(root));

    }
    //protected void onHelloButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
    //}
}