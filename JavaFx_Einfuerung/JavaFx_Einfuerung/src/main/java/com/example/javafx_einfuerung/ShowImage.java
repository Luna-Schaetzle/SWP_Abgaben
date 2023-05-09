package com.example.javafx_einfuerung;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ShowImage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Erstellen des ImageViews
        ImageView imageView = new ImageView(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/Stylized_uwu_emoticon.svg/220px-Stylized_uwu_emoticon.svg.png"));
        //Button
        StackPane root = new StackPane();
         Button b = new Button("Hallo");
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //System.out.println("Hallo");
                //root.getChildren().add(imageView);
                //make a note in a log file
                String message = "Neuer Eintrag: " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

                // Schreiben des Logbucheintrags in die Datei
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
                    writer.write(message);
                    writer.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }



            }
        });


        // Erstellen des Layouts und Hinzufügen des ImageViews
        root.getChildren().add(imageView);
        root.getChildren().add(b);

        // Erstellen der Szene und Hinzufügen des Layouts
        Scene scene = new Scene(root, 400, 300);



        // Setzen des Titels und Anzeigen der Szene
        primaryStage.setTitle("Bild anzeigen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
