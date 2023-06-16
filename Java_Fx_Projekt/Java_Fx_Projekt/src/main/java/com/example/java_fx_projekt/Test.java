package com.example.java_fx_projekt;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Test extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage Demo_Stage) {
        //Create a Text object
        Text Demo_Text = new Text();
        //Set the text to be added.
        Demo_Text.setText("Hello, This is delftstack.com");
        //set the position of the text
        Demo_Text.setX(80);
        Demo_Text.setY(80);
        //Create a Group object
        Group Group_Root = new Group(Demo_Text);
        //Create a scene object
        Scene Demo_Scene = new Scene(Group_Root, 600, 300);
        //Set title to the Stage
        Demo_Stage.setTitle("Text Display");
        //Add scene to the stage
        Demo_Stage.setScene(Demo_Scene);
        //Display the contents of the stage
        Demo_Stage.show();
    }
}
