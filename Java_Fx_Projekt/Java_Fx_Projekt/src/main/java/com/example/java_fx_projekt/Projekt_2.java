package com.example.java_fx_projekt;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Projekt_2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static Path input_1 = Path.of("C:\\Users\\Admin\\git\\SWP_Abgaben\\Java_Fx_Projekt\\Java_Fx_Projekt\\src\\main\\resources\\com\\example\\java_fx_projekt\\Input_1.txt");
    public static Path input_2 = Path.of("C:\\Users\\Admin\\git\\SWP_Abgaben\\Java_Fx_Projekt\\Java_Fx_Projekt\\src\\main\\resources\\com\\example\\java_fx_projekt\\Input_2.txt");

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Projekt_V_1");

        // Hallo-Text
        Text hallo = new Text("Hallo!");
        hallo.setStyle("-fx-font-size: 24;");

        // Nachricht-Text
        Text nachricht = new Text();
        nachricht.setStyle("-fx-font-size: 18;");

        // Button
        Button button = new Button("Neue Nachricht generieren");
        button.setStyle("-fx-font-size: 16;");
        button.setOnAction(e -> {
            // Nachricht generieren
            String nachricht_String = "Ich ";
            // Erste Datei auslesen
            nachricht_String += input_1_auslesen() + " in ";
            // Zählen der Zeilen der zweiten Datei
            nachricht_String += input_2_auslesen() + "!";
            nachricht.setText(nachricht_String);
        });

        // VBox für die Anordnung der Elemente
        VBox vbox = new VBox(20, hallo, button, nachricht);
        vbox.setPadding(new Insets(20));
        vbox.setStyle("-fx-background-color: #f4f4f4;");

        Scene scene = new Scene(vbox, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // leere Zeilen in den Dateien vermeiden
    static String input_1_auslesen() {
        List<String> lines = readLinesFromFile(input_1.toString());
        if (!lines.isEmpty()) {
            int lineNumber = new Random().nextInt(lines.size());
            return lines.get(lineNumber);
        }
        return "";
    }

    static String input_2_auslesen() {
        List<String> lines = readLinesFromFile(input_2.toString());
        if (!lines.isEmpty()) {
            int lineNumber = new Random().nextInt(lines.size());
            return lines.get(lineNumber);
        }
        return "";
    }

    private static List<String> readLinesFromFile(String filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
