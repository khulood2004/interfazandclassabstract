package com.example.musica;

public class Main {

    public static void main(String[] args) {
        Instrument.Piano myPiano = new  Instrument.Piano();
        Instrument.Guitar myGuitar = new Instrument.Guitar();
        myPiano.play();
        myPiano.tune();
        myGuitar.play();
        myGuitar.tune();
    }
}


