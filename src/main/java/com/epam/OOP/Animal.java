package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public String result;

    public Animal(String clr, int paws, boolean fur) {
        color = clr;
        numberOfPaws = paws;
        hasFur = fur;
    }

    public String getDescription() {
        String paw = " paw";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + (numberOfPaws > 1 ? " paws" : " paw")
                + " and " + (hasFur ? "a" : "no") + " fur.";
    }

}
