package com.example.javafx_einfuerung.Texteditor;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Texteditor extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        TextArea openfile = new TextArea();
        openfile.setPrefColumnCount(20);
        openfile.setPrefRowCount(0);
        openfile.setWrapText(true);

        TextArea namefile = new TextArea();
        openfile.setPrefColumnCount(20);
        openfile.setPrefRowCount(0);
        openfile.setWrapText(true);

        TextArea textArea = new TextArea();
        openfile.setPrefColumnCount(20);
        openfile.setPrefRowCount(0);
        openfile.setWrapText(true);





    }

    public static void main(String[] args) {
        launch(args);
    }

}
