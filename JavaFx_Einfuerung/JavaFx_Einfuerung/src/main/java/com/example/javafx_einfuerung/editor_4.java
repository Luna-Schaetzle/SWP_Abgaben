package com.example.javafx_einfuerung;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class editor_4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private static Path path;
    private static String defpath = "C:/Users/Admin/Desktop/text_editor_files/"; //defoult path

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("luna scripturae");
        TextArea area = new TextArea();
        area.setPrefColumnCount(43);
        area.setPrefRowCount(20);
        area.setWrapText(true);


        TextField textField = new TextField();
        textField.setPromptText("Path");
        textField.setPrefColumnCount(22); //30 Chars
        Alert alert = new Alert(Alert.AlertType.NONE);


        Button changePath = new Button("Change Path");
        changePath.setOnAction(e -> {
            TextInputDialog dialog = new TextInputDialog(defpath);
            dialog.setTitle("Change Path");
            dialog.setHeaderText("Change the Path");
            dialog.setContentText("Please enter the new Path: \n");

            Optional<String> result = dialog.showAndWait();
            if (result.isPresent()){
                defpath = result.get();
                alert.setAlertType(Alert.AlertType.INFORMATION);
                alert.setContentText("Path wurde geändert: \n" + defpath);
                alert.show();
            }
        });

        //New File
        Button newFile = new Button("New File");
        newFile.setOnAction(e -> {

            TextInputDialog dialog = new TextInputDialog("new file");
            dialog.setTitle("new File");
            dialog.setHeaderText("Name the new File");
            dialog.setContentText("Please enter the file name: \n");


            Optional<String> result = dialog.showAndWait();
            if (result.isPresent()){

                path = Path.of(defpath + result.get() + ".txt");

               //Neues File erstellen
                File file = new File(String.valueOf(path));

                try {
                    if (file.createNewFile()) {
//                        System.out.println("Die Datei wurde erfolgreich erstellt: " + file.getAbsolutePath());
                        textField.setText(path.toString());
                        alert.setAlertType(Alert.AlertType.INFORMATION);
                        alert.setContentText("Die Datei wurde erfolgreich erstellt: \n" + file.getAbsolutePath());
                        alert.show();
                    } else {
//                        System.out.println("Die Datei existiert bereits.");
                        alert.setAlertType(Alert.AlertType.ERROR);
                        alert.setContentText("Die Datei existiert bereits.");
                        alert.show();
                    }
                } catch (IOException f) {
//                    System.out.println(String.valueOf(path));
//                    System.out.println("Fehler beim Erstellen der Datei: " + f.getMessage());
                    alert.setAlertType(Alert.AlertType.ERROR);
                    alert.setContentText("Fehler beim Erstellen der Datei: \n" + f.getMessage());
                    alert.show();
                }



            }

        });


        //Ausuchen des Files
        FileChooser fileChooser = new FileChooser();
        Button open = new Button("Open");
        open.setOnAction(e -> {
            File selectedFile = fileChooser.showOpenDialog(primaryStage);
//            System.out.println(selectedFile.getAbsolutePath());
            path = selectedFile.toPath();
            textField.setText(path.toString());

            // Lesen der Datei und Anzeigen des Inhalts im Textfeld
            try {
                area.setText(Files.readString(path));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });



        Alert a = new Alert(Alert.AlertType.NONE);

        Button save = new Button("Save");

        save.setOnAction(e -> {
            String text = area.getText();
            if (path == null) {
                a.setAlertType(Alert.AlertType.ERROR);
                a.setContentText("No File selected");
                a.show();
            }
            else{
                try {
                    Files.writeString(path, text); // Schreiben des Strings in die Datei
                } catch (IOException f) {
                    throw new RuntimeException(f);
                }
                //alert
                a.setAlertType(Alert.AlertType.INFORMATION);
                a.setContentText("Text Wurde gespeichert in: \n" + path);
                a.show();
            }



        });


        VBox layout = new VBox();
        HBox hBox = new HBox();
        hBox.getChildren().addAll(newFile,open,textField,changePath,save);

        layout.getChildren().addAll(hBox, new Group(area));

        Scene scene = new Scene(layout, 500,400); // Breite, Höhe 500, 400
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}