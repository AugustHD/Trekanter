package com.company;

public class Trekant {
    private int trekantSideA;
    private int trekantSideB;
    private int trekantSideC;

    public Trekant(int trekantSide1, int trekantSideB, int trekantSideC) {
        this.trekantSideA = trekantSideA;
        this.trekantSideB = trekantSideB;
        this.trekantSideC = trekantSideC;
    }
    public String trekantType() {
        if (trekantSideA == trekantSideB && trekantSideB == trekantSideC && trekantSideA == trekantSideC) {
            return "Din trekant er en ligesidet trekant!";
        } else if (trekantSideA == trekantSideB || trekantSideA == trekantSideC || trekantSideB == trekantSideC) {
            return "Din trekant er en ligebenet trekant!";
        } else {
            return "Din trekant er en vilkårlig trekant!";
        }

    }
}

