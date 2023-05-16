/*
Ein einfacher Texteditor mit Menüleiste und Toolbar.
buffertReader und bufferedWriter
 */


package com.example.javafx_einfuerung;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class editor_3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private static Path path;

    @Override
    public void start(Stage primaryStage) {

        TextArea area = new TextArea();
        area.setPrefColumnCount(43);
        area.setPrefRowCount(20);
        area.setWrapText(true);

        // Eingabe via Button abfragen

        //Ausuchen des Files
        FileChooser fileChooser = new FileChooser();
        Button button = new Button("Open");
        button.setOnAction(e -> {
            File selectedFile = fileChooser.showOpenDialog(primaryStage);
//            System.out.println(selectedFile.getAbsolutePath());
            path = selectedFile.toPath();

            // Lesen der Datei und Anzeigen des Inhalts im Textfeld
            try {
                area.setText(Files.readString(path));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });



        Alert a = new Alert(Alert.AlertType.NONE);

        Button save = new Button("Save");

        save.setOnAction(e -> {
            String text = area.getText();
            try {
                Files.writeString(path, text); // Schreiben des Strings in die Datei
            } catch (IOException f) {
                throw new RuntimeException(f);
            }

            //alert
            a.setAlertType(Alert.AlertType.INFORMATION);
            a.setContentText("Text Wurde gespeichert in: " + path);
            a.show();

        });




        VBox layout = new VBox();
        layout.getChildren().addAll(save, button, new Group(area));

        Scene scene = new Scene(layout, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
