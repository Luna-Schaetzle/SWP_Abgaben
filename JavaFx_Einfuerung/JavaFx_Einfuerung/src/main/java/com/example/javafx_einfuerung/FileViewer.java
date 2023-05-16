package com.example.javafx_einfuerung;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FileViewer extends Application {

    @Override
    public void start(Stage primaryStage) {
        /*
        StackPane root = new StackPane();

        final String[] path = new String[1];

        FileChooser fileChooser = new FileChooser();
        Button button = new Button("Select File");
        button.setOnAction(e -> {
            File selectedFile = fileChooser.showOpenDialog(primaryStage);
            //System.out.println(selectedFile.getAbsolutePath());
            //path[0] = selectedFile.getAbsolutePath();
        });


        //path[0] = "C:\\Users\\Admin\\Desktop\\test.txt";

        // Erstellen des Textfelds
        TextArea textArea = new TextArea();

        // Lesen der Datei und Anzeigen des Inhalts im Textfeld
        try (BufferedReader reader = new BufferedReader(new FileReader(path[0]))) {
            String line;
            while ((line = reader.readLine()) != null) {
                textArea.appendText(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Erstellen der Szene und Anzeigen des Fensters
        //StackPane root = new StackPane(textArea);
        //Scene scene = new Scene(root, 400, 400);
        root.getChildren().add(textArea);
        root.getChildren().add(button);
        Scene scene = new Scene(root, 960, 600);
        primaryStage.setTitle("Dateianzeige");
        primaryStage.setScene(scene);
        primaryStage.show();

         */
        TextArea textArea = new TextArea();

        // Erstellen des FileChoosers
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Datei auswählen");

        // Festlegen des Dateifilters auf Textdateien
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Textdateien (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);

        // Anzeigen des FileChoosers und Lesen der ausgewählten Datei
        File selectedFile = fileChooser.showOpenDialog(primaryStage);
        if (selectedFile != null) {
            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    textArea.appendText(line + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Erstellen der Szene und Anzeigen des Fensters
        StackPane root = new StackPane(textArea);
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Dateianzeige");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
