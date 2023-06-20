package com.example.java_fx_projekt;

public class Karte {

    private String name;

    private int wert;
    private String bild; //URL

    public Karte(String name, int wert, String bild) {
        this.name = name;
        this.wert = wert;
        this.bild = bild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    public String getBild() {
        return bild;
    }

    public void setBild(String bild) {
        this.bild = bild;
    }
}
