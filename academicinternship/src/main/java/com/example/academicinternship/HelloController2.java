package com.example.academicinternship;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController2 implements Initializable {

    private Text Lbl2;

    DataSingleton data = DataSingleton.getInstance();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle ){
        Lbl2.setText(data.getUserName());
    }
    @FXML
    void Lbl2(ActionEvent event) throws IOException{
        Stage stage = (Stage) Lbl2.getScene().getWindow();
        Parent root = FXMLLoader.load((getClass().getResource("hello-view.fxml")));
        stage.setTitle("hello-view.fxml");
        stage.setScene(new Scene(root));
    //private Label Lbl2;

   // @FXML
   // protected void onHelloButtonClick() {
      //  Lbl2.setText("Welcome to JavaFX Application!");
        }

   // @Override
   // public void initialize(URL url, ResourceBundle resourceBundle) {


}
