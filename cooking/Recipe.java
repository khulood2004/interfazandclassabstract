package com.example.cooking;

public interface Recipe {
    void prepare();
    void cook();
    class Pizza implements Recipe {
        public void prepare() {
            System.out.println("Preparing pizza: Rolling dough and adding toppings.");
        }
        public void cook() {
            System.out.println("Cooking pizza: Baking in the oven.");
        }
    }

    class Pasta implements Recipe {
        public void prepare() {
            System.out.println("Preparing pasta: Boiling water and cooking noodles.");
        }
        public void cook() {
            System.out.println("Cooking pasta: Mixing with sauce and serving.");
        }
    }


}
