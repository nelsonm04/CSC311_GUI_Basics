package com.example.csc311_gui_basics;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField yourName;
    @FXML
    private ImageView bunnyPic;

    @FXML
    protected void onHelloButtonClick() {
        String name= yourName.getText();
        welcomeText.setText("Welcome " + name );
    }
    @FXML
    public void initialize() {
        Image image = new Image(getClass().getResource("/com/example/csc311_gui_basics/bunny.jpeg").toExternalForm());
        bunnyPic.setImage(image);
    }
}