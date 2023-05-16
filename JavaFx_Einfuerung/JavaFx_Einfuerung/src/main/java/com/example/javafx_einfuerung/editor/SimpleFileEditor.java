package com.example.javafx_einfuerung.editor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class SimpleFileEditor extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/SimpleFileEditor.fxml"));
        Parent root = loader.load();
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("img/EdenCodingIcon.png")));
        primaryStage.setTitle("Simple EdenCoding JavaFX File Editor");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    /*
    public static void main(String[] args) {
        launch(args);
    }

     */
}