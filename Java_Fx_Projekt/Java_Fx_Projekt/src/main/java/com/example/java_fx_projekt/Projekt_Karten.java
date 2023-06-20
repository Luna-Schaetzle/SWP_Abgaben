package com.example.java_fx_projekt;

import javafx.application.Application;
import javafx.stage.Stage;

public class Projekt_Karten extends Application {



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }

    public void kartegeneriern(){
        //Karten generieren
        Karte karte[] = new Karte[51];
        //Kreuz
        karte[0] = new Karte("Kreuz 2", 2, "");
        karte[1] = new Karte("Kreuz 3", 3, "");
        karte[2] = new Karte("Kreuz 4", 4, "");
        karte[3] = new Karte("Kreuz 5", 5, "");
        karte[4] = new Karte("Kreuz 6", 6, "");
        karte[5] = new Karte("Kreuz 7", 7, "");
        karte[6] = new Karte("Kreuz 8", 8, "");
        karte[7] = new Karte("Kreuz 9", 9, "");
        karte[8] = new Karte("Kreuz 10", 10, "");
        karte[9] = new Karte("Kreuz Bube", 11, "");
        karte[10] = new Karte("Kreuz Dame", 12, "");
        karte[11] = new Karte("Kreuz König", 13, "");
        karte[12] = new Karte("Kreuz Ass", 11, "");

        karte[13] = new Karte("Pik 2", 2, "");
        karte[14] = new Karte("Pik 3", 3, "");
        karte[15] = new Karte("Pik 4", 4, "");
        karte[16] = new Karte("Pik 5", 5, "");
        karte[17] = new Karte("Pik 6", 6, "");
        karte[18] = new Karte("Pik 7", 7, "");
        karte[19] = new Karte("Pik 8", 8, "");
        karte[20] = new Karte("Pik 9", 9, "");
        karte[21] = new Karte("Pik 10", 10, "");
        karte[22] = new Karte("Pik Bube", 11, "");
        karte[23] = new Karte("Pik Dame", 12, "");
        karte[24] = new Karte("Pik König", 13, "");
        karte[25] = new Karte("Pik Ass", 11, "");

        karte[26] = new Karte("Herz 2", 2, "");
        karte[27] = new Karte("Herz 3", 3, "");
        karte[28] = new Karte("Herz 4", 4, "");
        karte[29] = new Karte("Herz 5", 5, "");
        karte[30] = new Karte("Herz 6", 6, "");
        karte[31] = new Karte("Herz 7", 7, "");
        karte[32] = new Karte("Herz 8", 8, "");
        karte[33] = new Karte("Herz 9", 9, "");
        karte[34] = new Karte("Herz 10", 10, "");
        karte[35] = new Karte("Herz Bube", 11, "");
        karte[36] = new Karte("Herz Dame", 12, "");
        karte[37] = new Karte("Herz König", 13, "");
        karte[38] = new Karte("Herz Ass", 11, "");

        karte[39] = new Karte("Karo 2", 2, "");
        karte[40] = new Karte("Karo 3", 3, "");
        karte[41] = new Karte("Karo 4", 4, "");
        karte[42] = new Karte("Karo 5", 5, "");
        karte[43] = new Karte("Karo 6", 6, "");
        karte[44] = new Karte("Karo 7", 7, "");
        karte[45] = new Karte("Karo 8", 8, "");
        karte[46] = new Karte("Karo 9", 9, "");
        karte[47] = new Karte("Karo 10", 10, "");
        karte[48] = new Karte("Karo Bube", 11, "");
        karte[49] = new Karte("Karo Dame", 12, "");
        karte[50] = new Karte("Karo König", 13, "");
        karte[51] = new Karte("Karo Ass", 11, "");



    }
}
