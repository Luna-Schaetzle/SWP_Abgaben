package com.example.javafx_einfuerung;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class DockingSimulation extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int SHIP_SIZE = 20;
    private static final int TARGET_SIZE = 40;
    private static final double MAX_SPEED = 5.0;
    private static final double ANGLE_SPEED = 2.0;
    private static final double DOCKING_DISTANCE = 0.1;

    private double shipX;
    private double shipY;
    private double shipAngle;
    private double shipSpeed;
    private double targetX;
    private double targetY;

    private boolean isThrusting;
    private boolean isTurningLeft;
    private boolean isTurningRight;
    private boolean isBoosting;
    private boolean isBraking;

    private double distance;

    @Override
    public void start(Stage primaryStage) {
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        StackPane root = new StackPane(canvas);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.W) {
                isThrusting = true;
            }
            if (event.getCode() == KeyCode.A) {
                isTurningLeft = true;
            }
            if (event.getCode() == KeyCode.D) {
                isTurningRight = true;
            }
            if (event.getCode() == KeyCode.E) {
                isBoosting = true;
            }
            if (event.getCode() == KeyCode.Q) {
                isBraking = true;
            }
        });

        scene.setOnKeyReleased(event -> {
            if (event.getCode() == KeyCode.W) {
                isThrusting = false;
            }
            if (event.getCode() == KeyCode.A) {
                isTurningLeft = false;
            }
            if (event.getCode() == KeyCode.D) {
                isTurningRight = false;
            }
            if (event.getCode() == KeyCode.E) {
                isBoosting = false;
            }
            if (event.getCode() == KeyCode.Q) {
                isBraking = false;
            }
        });

        primaryStage.setTitle("Docking Simulation");
        primaryStage.setFullScreen(true);
        primaryStage.setScene(scene);
        primaryStage.show();

        AnimationTimer gameLoop = new AnimationTimer() {
            @Override
            public void handle(long now) {
                update();
                render(gc);
            }
        };
        gameLoop.start();
    }

    private void update() {
        // Steuerung des Raumschiffs
        if (isThrusting) {
            double dx = Math.cos(Math.toRadians(shipAngle)) * 0.2;
            double dy = Math.sin(Math.toRadians(shipAngle)) * 0.2;
            shipSpeed = Math.min(shipSpeed + 0.2, MAX_SPEED);
            shipX += dx;
            shipY += dy;
        } else {
            shipSpeed *= 0.98;
        }

        if (isTurningLeft) {
            shipAngle -= ANGLE_SPEED;
        }
        if (isTurningRight) {
            shipAngle += ANGLE_SPEED;
        }

        if (isBoosting) {
            double dx = Math.cos(Math.toRadians(shipAngle)) * 0.02;
            double dy = Math.sin(Math.toRadians(shipAngle)) * 0.02;
            shipSpeed = Math.min(shipSpeed + 0.02, MAX_SPEED);
            shipX += dx;
            shipY += dy;
        }

        if (isBraking) {
            double dx = Math.cos(Math.toRadians(shipAngle)) * -0.02;
            double dy = Math.sin(Math.toRadians(shipAngle)) * -0.02;
            shipX += dx;
            shipY += dy;
        }

        // Bewegung des Zielobjekts
        double targetSpeed = shipSpeed * 0.75;
        targetX += targetSpeed * Math.cos(Math.toRadians(shipAngle));
        targetY += targetSpeed * Math.sin(Math.toRadians(shipAngle));

        // Abstand berechnen
        distance = Math.sqrt(Math.pow(shipX - targetX, 2) + Math.pow(shipY - targetY, 2));
        if (distance < DOCKING_DISTANCE) {
            shipSpeed = 0;
            isThrusting = false;
            isTurningLeft = false;
            isTurningRight = false;
        }
    }

    private void render(GraphicsContext gc) {
        // Hintergrund zeichnen
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, WIDTH, HEIGHT);

        // Raumschiff zeichnen
        gc.setFill(Color.WHITE);
        gc.setStroke(Color.RED);
        gc.setLineWidth(1.0);
        gc.save();
        gc.translate(WIDTH / 2, HEIGHT / 2);
        gc.rotate(shipAngle);
        gc.beginPath();
        gc.moveTo(-SHIP_SIZE / 2, SHIP_SIZE / 2);
        gc.lineTo(SHIP_SIZE / 2, SHIP_SIZE / 2);
        gc.lineTo(0, -SHIP_SIZE / 2);
        gc.closePath();
        gc.fill();
        gc.stroke();
        gc.restore();

        // Zielobjekt zeichnen
        double targetScreenX = WIDTH / 2 + (targetX - shipX);
        double targetScreenY = HEIGHT / 2 + (targetY - shipY);
        gc.setFill(Color.GREEN);
        gc.fillOval(targetScreenX - TARGET_SIZE / 2, targetScreenY - TARGET_SIZE / 2, TARGET_SIZE, TARGET_SIZE);

        // Fadenkreuz zeichnen
        gc.setStroke(Color.WHITE);
        gc.setLineWidth(1.0);
        gc.beginPath();
        gc.moveTo(WIDTH / 2 - 10, HEIGHT / 2);
        gc.lineTo(WIDTH / 2 + 10, HEIGHT / 2);
        gc.moveTo(WIDTH / 2, HEIGHT / 2 - 10);
        gc.lineTo(WIDTH / 2, HEIGHT / 2 + 10);
        gc.stroke();

        // Abstand anzeigen
        gc.setFill(Color.WHITE);
        gc.setFont(Font.font("Arial", 14));
        gc.setTextAlign(TextAlignment.LEFT);
        gc.fillText("Distance: " + String.format("%.2f", distance) + " m", 10, 30);

        // Geschwindigkeit anzeigen
        gc.setFill(Color.WHITE);
        gc.setFont(Font.font("Arial", 14));
        gc.setTextAlign(TextAlignment.LEFT);
        gc.fillText("Speed: " + String.format("%.2f", shipSpeed) + " m/s", 10, 60);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
