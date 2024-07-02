package com.example.abstractclass;

public abstract class Colour {
    public abstract void describeColour();
    public void show() {
        System.out.println("Displaying the colour");
    }
}

class Red extends Colour {
    public void describeColour() {
        System.out.println("Red is the colour of fire and blood.");
    }
}

class Blue extends Colour {
    public void describeColour() {
        System.out.println("Blue is the colour of the sky and sea.");
    }
}

