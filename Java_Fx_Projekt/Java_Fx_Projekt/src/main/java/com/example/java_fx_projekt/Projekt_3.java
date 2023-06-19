package com.example.java_fx_projekt;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;

public class Projekt_3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static Path input_1 = Path.of("C:\\Users\\Admin\\git\\SWP_Abgaben\\Java_Fx_Projekt\\Java_Fx_Projekt\\src\\main\\resources\\com\\example\\java_fx_projekt\\Input_1.txt");
    public static Path input_2 = Path.of("C:\\Users\\Admin\\git\\SWP_Abgaben\\Java_Fx_Projekt\\Java_Fx_Projekt\\src\\main\\resources\\com\\example\\java_fx_projekt\\Input_2.txt");

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Projekt_V_2");

        // Hallo-Text
        Text hallo = new Text("</Hallo World!>");
        hallo.setFont(Font.font(24));
        hallo.setFill(Color.WHITE);

        // Nachricht-Text
        Text nachricht = new Text();
        nachricht.setFont(Font.font(18));
        nachricht.setFill(Color.WHITE);

        // Button
        Button button = new Button("Neue Nachricht generieren");
        button.setFont(Font.font(16));
        button.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white;");
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
        VBox vbox = new VBox(20, hallo, nachricht, button);
        vbox.setPadding(new Insets(20));
        vbox.setBackground(new Background(new BackgroundFill(Color.rgb(35, 40, 45), CornerRadii.EMPTY, Insets.EMPTY)));

        Scene scene = new Scene(vbox, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // leere Zeilen in den Dateien vermeiden
    static String input_1_auslesen() {
        List<String> lines = readLinesFromFile(input_1);
        if (!lines.isEmpty()) {
            int lineNumber = new Random().nextInt(lines.size());
            return lines.get(lineNumber);
        }
        return "";
    }

    static String input_2_auslesen() {
        List<String> lines = readLinesFromFile(input_2);
        if (!lines.isEmpty()) {
            int lineNumber = new Random().nextInt(lines.size());
            return lines.get(lineNumber);
        }
        return "";
    }

    private static List<String> readLinesFromFile(Path filePath) {
        try {
            return Files.readAllLines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return List.of();
    }
}
