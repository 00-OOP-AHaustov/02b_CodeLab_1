package com.cc.java;

public class Konto {
    private int kontostand;

    public Konto() {
        this.kontostand = 10000;
    }

    public Konto(int kontostand) {
        this.kontostand = kontostand;
    }

    public int getKontostand() {
        return this.kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

}
