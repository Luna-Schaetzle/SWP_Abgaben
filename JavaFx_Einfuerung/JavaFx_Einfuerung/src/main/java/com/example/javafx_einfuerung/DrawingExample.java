package com.example.javafx_einfuerung;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DrawingExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Erstellen einer Leinwand
        Canvas canvas = new Canvas(400, 400);

        // Erstellen des Zeichenkontexts
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Zeichnen einer Linie
        gc.setStroke(Color.RED);
        gc.setLineWidth(3);
        gc.strokeLine(50, 50, 350, 350);

        gc.setStroke(Color.GREEN);
        gc.setLineWidth(3);
        gc.strokeLine(0, 0, 600, 200);

        // Erstellen der Szene und Anzeigen des Fensters
        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Zeichnungsbeispiel");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
