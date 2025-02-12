package com.example.csc311_gui_basics;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GUIApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GUIApplication.class.getResource("GUI-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 600);
        scene.getStylesheets().add(GUIApplication.class.getResource("mystyle.css").toExternalForm());
        stage.setTitle("GUI");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}