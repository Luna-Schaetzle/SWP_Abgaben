package com.example.javafx_einfuerung;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TransgenderFlag extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);

        // Die Größe der Flagge und ihrer Komponenten
        int flagWidth = 300;
        int flagHeight = 200;
        int stripeWidth = flagWidth / 5;

        // Erstellen und Hinzufügen der blauen und rosa Streifen
        Rectangle blueStripe = new Rectangle(0, 0, stripeWidth, flagHeight);
        blueStripe.setFill(Color.rgb(91, 184, 253));
        Rectangle pinkStripe = new Rectangle(stripeWidth, 0, stripeWidth, flagHeight);
        pinkStripe.setFill(Color.rgb(243, 120, 182));
        root.getChildren().addAll(blueStripe, pinkStripe);

        // Hinzufügen des weißen Streifens
        Rectangle whiteStripe = new Rectangle(stripeWidth * 2, 0, stripeWidth, flagHeight);
        whiteStripe.setFill(Color.WHITE);
        root.getChildren().add(whiteStripe);

        // Hinzufügen der transparenten Streifen
        Rectangle topTransparentStripe = new Rectangle(0, 0, flagWidth, flagHeight / 2);
        topTransparentStripe.setFill(Color.TRANSPARENT);
        Rectangle bottomTransparentStripe = new Rectangle(0, flagHeight / 2, flagWidth, flagHeight / 2);
        bottomTransparentStripe.setFill(Color.TRANSPARENT);
        root.getChildren().addAll(topTransparentStripe, bottomTransparentStripe);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
