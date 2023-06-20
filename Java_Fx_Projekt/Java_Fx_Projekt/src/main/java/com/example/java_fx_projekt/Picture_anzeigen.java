package com.example.java_fx_projekt;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
public class Picture_anzeigen extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Online Image Loading Example");

        // Erstelle einen ImageView
        ImageView imageView = new ImageView();

        try {
            // Lade das Bild von einer Online-URL
            String imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Anthro_vixen_colored.jpg/220px-Anthro_vixen_colored.jpg";
            Image image = new Image(new URL(imageUrl).openStream());

            // Setze das Bild im ImageView
            imageView.setImage(image);

            // Passe die Größe des ImageView an die Größe des Bildes an
            imageView.setFitWidth(image.getWidth());
            imageView.setFitHeight(image.getHeight());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Erstelle eine StackPane als Layout
        StackPane root = new StackPane();
        root.getChildren().add(imageView);

        // Erstelle eine Scene mit der StackPane als Wurzel
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
