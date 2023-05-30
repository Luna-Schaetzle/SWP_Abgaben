package com.example.javafx_einfuerung;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SolarSystemSimulation extends Application {

    private static final double SUN_RADIUS = 50;
    private static final double[] PLANET_RADII = { 2, 5, 10, 15, 20, 25, 30, 35 };
    private static final double[] PLANET_ORBIT_RADII = { 60, 100, 150, 200, 250, 300, 350, 400 };
    private static final double[] PLANET_SPEEDS = { 0.02, 0.015, 0.01, 0.007, 0.005, 0.003, 0.002, 0.001 };
    private static final int NUM_PLANETS = PLANET_RADII.length;

    private Circle sun;
    private Circle[] planets;
    private double[] angles;

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        primaryStage.setFullScreen(true);

        sun = createCelestialBody(SUN_RADIUS, Color.YELLOW);

        planets = new Circle[NUM_PLANETS];
        angles = new double[NUM_PLANETS];

        for (int i = 0; i < NUM_PLANETS; i++) {
            planets[i] = createCelestialBody(PLANET_RADII[i], getRandomColor());
            angles[i] = Math.random() * 360;
        }

        Line[] orbits = new Line[NUM_PLANETS];
        for (int i = 0; i < NUM_PLANETS; i++) {
            orbits[i] = createOrbit(PLANET_ORBIT_RADII[i]);
        }

        root.getChildren().addAll(sun);
        root.getChildren().addAll(orbits);
        root.getChildren().addAll(planets);

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(16), event -> {
            update();
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

        primaryStage.setTitle("Solar System Simulation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Circle createCelestialBody(double radius, Color color) {
        Circle celestialBody = new Circle(radius, color);
        celestialBody.setStroke(Color.BLACK);
        celestialBody.setStrokeWidth(1.0);
        celestialBody.setCenterX(400);
        celestialBody.setCenterY(300);
        return celestialBody;
    }

    private Line createOrbit(double radius) {
        Line orbit = new Line();
        orbit.setStroke(Color.DARKGRAY);
        orbit.getStrokeDashArray().addAll(2.0, 4.0);
        orbit.setStrokeWidth(1.0);
        orbit.setTranslateX(400);
        orbit.setTranslateY(300);
//        orbit.setRadius(radius);
        orbit.setStartX(radius);
        return orbit;
    }

    private void update() {
        for (int i = 0; i < NUM_PLANETS; i++) {
            angles[i] += PLANET_SPEEDS[i];
            double x = PLANET_ORBIT_RADII[i] * Math.cos(angles[i]);
            double y = PLANET_ORBIT_RADII[i] * Math.sin(angles[i]);
            planets[i].setCenterX(x + 400);
            planets[i].setCenterY(y + 300);
        }
    }

    private Color getRandomColor() {
        return Color.rgb((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
