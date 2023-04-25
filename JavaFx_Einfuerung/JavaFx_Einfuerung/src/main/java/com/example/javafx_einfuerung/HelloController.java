package com.example.javafx_einfuerung;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("LOL");
    }

    @FXML
    protected void onHelloButtonClick2() {
        welcomeText.setText("https://www.youtube.com/watch?v=dQw4w9WgXcQ");


    }


}