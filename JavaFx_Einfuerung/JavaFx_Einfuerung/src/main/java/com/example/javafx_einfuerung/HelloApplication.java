package com.example.javafx_einfuerung;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        /*
        System.out.println("HelloApplication.start()");


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

         */




        System.out.println("HelloApplication.start() - 2");

        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("hello-view-2.fxml"));
        Scene scene2 = new Scene(fxmlLoader2.load(), 320, 240);
        stage.setTitle("Hello Rick!");
        stage.setScene(scene2);
        stage.show();







    }

    public static void main(String[] args) {
        launch(args);
    }
}