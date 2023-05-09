package com.example.javafx_einfuerung;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class SinusFunction extends Application {

    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private static final double X_AXIS_LENGTH = 4 * Math.PI;
    private static final double Y_AXIS_UPPER_BOUND = 1.2;
    private static final double Y_AXIS_LOWER_BOUND = -1.2;
    private static final int ANIMATION_SPEED = 60; // in frames per second

    private double phase = 0.0;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sinusfunktion");

        // X- und Y-Achsen erstellen
        final NumberAxis xAxis = new NumberAxis(0, X_AXIS_LENGTH, X_AXIS_LENGTH / 4);
        final NumberAxis yAxis = new NumberAxis(Y_AXIS_LOWER_BOUND, Y_AXIS_UPPER_BOUND, 0.2);
        xAxis.setLabel("x");
        yAxis.setLabel("y");

        // Datenreihe erstellen
        final XYChart.Series<Number, Number> data = new XYChart.Series<>();
        data.setName("Sinusfunktion");

        // Chart erstellen
        final LineChart<Number, Number> chart = new LineChart<>(xAxis, yAxis);
        chart.setAnimated(false);
        chart.getData().add(data);

        // Szene erstellen
        Scene scene = new Scene(chart, WINDOW_WIDTH, WINDOW_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Animations-Loop starten
        AnimationTimer animationTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                data.getData().clear();
                for (double x = 0.0; x <= X_AXIS_LENGTH; x += 0.05) {
                    double y = Math.sin(x + phase);
                    data.getData().add(new XYChart.Data<>(x, y));
                }
                phase += 0.05;
            }
        };
        animationTimer.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
