package com.example.appdev;

public class Rekenen {

    int getal1, getal2;

    public Rekenen(int getal1, int getal2) {
        this.getal1 = getal1;
        this.getal2 = getal2;

    }

    public Rekenen() {
    }

    public int getGetal1() {
        return getal1;
    }

    public void setGetal1(int getal1) {
        this.getal1 = getal1;
    }

    public int getGetal2() {
        return getal2;
    }

    public void setGetal2(int getal2) {
        this.getal2 = getal2;
    }

    public int opTellen() {
        return this.getal1+this.getal2;
    }
}
