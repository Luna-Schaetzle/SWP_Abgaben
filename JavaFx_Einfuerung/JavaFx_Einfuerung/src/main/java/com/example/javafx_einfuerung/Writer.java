package com.example.javafx_einfuerung;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Writer {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Desktop\\test2.txt"); // Pfad zur Datei
        String test = "Hallo Welt\nHallo Welt 2\nHallo Welt 3"; // \n = new line
        try {
            Files.writeString(file.toPath(), test); // Schreiben des Strings in die Datei
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
