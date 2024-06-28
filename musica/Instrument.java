package com.example.musica;

public interface Instrument {
    void play();
    void tune();
    class Guitar implements Instrument {
        public void play() {
            System.out.println("Playing guitar: Strumming chords.");
        }
        public void tune() {
            System.out.println("Tuning guitar: Adjusting strings.");
        }
    }

    class Piano implements Instrument {
        public void play() {
            System.out.println("Playing piano: Pressing keys.");
        }
        public void tune() {
            System.out.println("Tuning piano: Tuning the strings inside.");
        }
    }
}
