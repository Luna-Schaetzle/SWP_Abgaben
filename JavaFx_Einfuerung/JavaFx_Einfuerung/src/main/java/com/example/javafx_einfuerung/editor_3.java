/*
Ein einfacher Texteditor mit Menüleiste und Toolbar.
buffertReader und bufferedWriter
 */


package com.example.javafx_einfuerung;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

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

    @Override
    public void start(Stage primaryStage) {
        File file = new File("C:\\Users\\Admin\\Desktop\\test.txt");

        TextArea area = new TextArea();
        area.setPrefColumnCount(43);
        area.setPrefRowCount(20);
        area.setWrapText(true);

        // Eingabe via Button abfragen
        Button btn = new Button("Submit");
        btn.setOnAction(e -> {
            String text = area.getText();
            try {
                Files.writeString(file.toPath(), text); // Schreiben des Strings in die Datei
            } catch (IOException f) {
                throw new RuntimeException(f);
            }
            //System.out.println(area.getText());
        });



        VBox layout = new VBox();
        layout.getChildren().addAll(btn, new Group(area));

        Scene scene = new Scene(layout, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
