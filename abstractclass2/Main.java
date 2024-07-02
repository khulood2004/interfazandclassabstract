package com.example.abstractclass2;

public class Main {
    public static void main(String[] args) {
        Day monday = new Monday();
        monday.displayMessage();
        monday.showDay();

        Day friday = new Friday();
        friday.displayMessage();
        friday.showDay();
    }
}
