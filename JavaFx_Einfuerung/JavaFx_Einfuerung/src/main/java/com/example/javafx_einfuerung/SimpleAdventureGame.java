package com.example.javafx_einfuerung;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SimpleAdventureGame extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int PLAYER_SIZE = 40;

    private double playerX = WIDTH / 10;
    private double playerY = HEIGHT / 10;

    private boolean[][] map = new boolean[WIDTH][HEIGHT];

    @Override
    public void start(Stage primaryStage) {
        System.out.println(WIDTH + "x" + HEIGHT + " window");
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Pane root = new Pane(canvas);

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Simple Adventure Game");
        primaryStage.show();

        scene.setOnKeyPressed(event -> {
            double oldPlayerX = playerX;
            double oldPlayerY = playerY;

            if (event.getCode() == KeyCode.W) {
                playerY -= 10;
            } else if (event.getCode() == KeyCode.S) {
                playerY += 10;
            } else if (event.getCode() == KeyCode.A) {
                playerX -= 10;
            } else if (event.getCode() == KeyCode.D) {
                playerX += 10;
            }

            // Check for collisions with walls
            if (isCollidingWithWalls()) {
                playerX = oldPlayerX;
                playerY = oldPlayerY;
            }

            // Update game logic and render the scene
            update(gc);
        });

        // Initial game rendering
        render(gc);
    }

    private void update(GraphicsContext gc) {
        // Clear the canvas
        gc.clearRect(0, 0, WIDTH, HEIGHT);

        generateMap();

        // Draw the player
        gc.setFill(Color.BLUE);
        gc.fillRect(playerX, playerY, PLAYER_SIZE, PLAYER_SIZE);

        // Draw the walls
        gc.setFill(Color.GRAY);
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                if (map[x][y]) {
                    gc.fillRect(x, y, 1, 1);
                }
            }
        }
    }

    private void render(GraphicsContext gc) {
        // Update game logic and render the scene
        update(gc);
    }

    private boolean isCollidingWithWalls() {
        // Check for collisions with walls
        int playerLeft = (int) playerX;
        int playerRight = (int) (playerX + PLAYER_SIZE);
        int playerTop = (int) playerY;
        int playerBottom = (int) (playerY + PLAYER_SIZE);

        for (int x = playerLeft; x <= playerRight; x++) {
            for (int y = playerTop; y <= playerBottom; y++) {
                if (map[x][y]) {
                    return true;
                }
            }
        }

        return false;
    }

    private void generateMap() {
        // Clear the map
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                map[x][y] = false;
            }
        }

        // Create the first room
        int room1X = 100;
        int room1Y = 100;
        int room1Width = 200;
        int room1Height = 300;

        for (int x = room1X; x < room1X + room1Width; x++) {
            for (int y = room1Y; y < room1Y + room1Height; y++) {
                map[x][y] = true;
            }
        }

        // Create the second room
        int room2X = 400;
        int room2Y = 200;
        int room2Width = 300;
        int room2Height = 200;

        for (int x = room2X; x < room2X + room2Width; x++) {
            for (int y = room2Y; y < room2Y + room2Height; y++) {
                map[x][y] = true;
            }
        }

        // Create the walls between the rooms
        for (int y = room1Y + room1Height / 2; y <= room2Y + room2Height / 2; y++) {
            map[room1X + room1Width][y] = true;
        }
    }



    public static void main(String[] args) {
        launch(args);
    }
}
