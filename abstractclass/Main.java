package com.example.abstractclass;

public class Main {
    public static void main(String[] args) {
        Red red = new Red(); 
        red.describeColour();
        red.show();

        Blue blue = new Blue();
        blue.describeColour();
        blue.show();
    }
}
