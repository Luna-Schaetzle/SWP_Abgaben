package com.example.javafx_einfuerung.Texteditor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FileViewer extends Application {
    private File selectedFile;

    @Override
    public void start(Stage primaryStage) {
        // Erstellen des Textfelds
        TextArea textArea = new TextArea();

        // Erstellen des FileChoosers
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Datei auswählen");

        // Festlegen des Dateifilters auf Textdateien
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Textdateien (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);

        // Erstellen des Buttons zum Öffnen des FileChoosers
        Button button = new Button("Datei auswählen");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                selectedFile = fileChooser.showOpenDialog(primaryStage);
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
            }
        });

        // Erstellen der Szene und Anzeigen des Fensters
        StackPane root = new StackPane(textArea, button);
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Dateianzeige");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
