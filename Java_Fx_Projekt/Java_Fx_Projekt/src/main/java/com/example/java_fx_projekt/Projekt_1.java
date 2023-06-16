package com.example.java_fx_projekt;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;
import java.nio.file.Path;
import java.util.Random;

public class Projekt_1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static Path input_1 = Path.of("C:\\Users\\Admin\\git\\SWP_Abgaben\\Java_Fx_Projekt\\Java_Fx_Projekt\\src\\main\\resources\\com\\example\\java_fx_projekt\\Input_1.txt");
    public static Path input_2 = Path.of("C:\\Users\\Admin\\git\\SWP_Abgaben\\Java_Fx_Projekt\\Java_Fx_Projekt\\src\\main\\resources\\com\\example\\java_fx_projekt\\Input_2.txt");


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Projekt_V_1");

        //Kopfzeile
        //Es soll Hallo! angezeigt werden
        //Wie gibt man einen Text aus?
        Text hallo = new Text("Hallo!");
        hallo.setX(50);
        hallo.setY(50);


        Text nachricht = new Text();
        nachricht.setX(50);
        nachricht.setY(50);


        Button button = new Button("Neue Nachricht generieren");
        button.setOnAction(e -> {
            //Nachricht generieren
            String nachricht_String = "Ich ";
            //Erste Datei auslesen
            nachricht_String += input_1_auslesen() + " in ";
            //Zählen der Zeilen der zweiten Datei
            nachricht_String += input_2_auslesen() + "!";
            nachricht.setText(nachricht_String);
        });








        //TODO: Scene verbessern
        VBox vbox = new VBox(hallo, button, nachricht);
//        HBox hBox = new HBox();
//        hBox.getChildren().addAll();
        vbox.getChildren().addAll();

        Scene scene = new Scene(vbox, 500, 400); // Breite, Höhe 500, 400
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    //TODO: lehrzeilen in den Dateien vermeiden
    static String input_1_auslesen(){
        int lineNumber;
        int lineCount = 0;
        String line = "";
        //Zählen der Zeilen
        try {
            FileReader fileReader = new FileReader(input_1.toString());
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.readLine() != null) {
                lineCount++;
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Zufällige Zeile auslesen
        try {
            FileReader fileReader = new FileReader(input_1.toString());
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            lineNumber = new Random().nextInt(lineCount);
            for (int i = 0; i < (lineNumber - 1); i++) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }

    static String input_2_auslesen(){
        int lineNumber;
        int lineCount = 0;
        String line = "";
        //Zählen der Zeilen
        try {
            FileReader fileReader = new FileReader(input_2.toString());
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.readLine() != null) {
                lineCount++;
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Zufällige Zeile auslesen
        try {
            FileReader fileReader = new FileReader(input_2.toString());
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            lineNumber = new Random().nextInt(lineCount);
            for (int i = 0; i < (lineNumber - 1); i++) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }



}
