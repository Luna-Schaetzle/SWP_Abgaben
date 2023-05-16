package com.example.javafx_einfuerung;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class BuffertReader {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Desktop\\test.txt");
        String test;
        try {
            test = Files.readString(file.toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(test);

    }

}
