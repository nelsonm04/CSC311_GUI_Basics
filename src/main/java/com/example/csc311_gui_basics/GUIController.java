package com.example.csc311_gui_basics;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GUIController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label nelson;

    @FXML
    private TextField yourName;
    @FXML
    private ImageView bunnyPic;

    @FXML
   private Button newButton;
    int x =10;


    @FXML
    protected void onHelloButtonClick() {
        String name= yourName.getText();
        welcomeText.setText("Welcome " + name );
        nelson.setRotate(45);

    }
    @FXML
    public void initialize() {
        Image image = new Image(getClass().getResource("/com/example/csc311_gui_basics/bunny.jpeg").toExternalForm());
        bunnyPic.setImage(image);
    }

    @FXML
    void rotateMe(ActionEvent event) {
        newButton.setRotate(x++);

    }

}