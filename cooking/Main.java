package com.example.cooking;

public class Main {
    public static void main(String[] args) {
        Recipe.Pizza myPizza = new Recipe.Pizza();
        Recipe.Pasta myPasta = new Recipe.Pasta();

        myPizza.prepare();
        myPizza.cook();
        myPasta.prepare();
        myPasta.cook();

    }
}
