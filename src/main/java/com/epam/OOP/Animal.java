package com.epam.OOP;

public class Animal {
    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    private Animal(String clr, int paws, boolean fur) {
        color = clr;
        numberOfPaws = paws;
        hasFur = fur;
    }

    public String getDescription() {
        String fur = isHasFur() ? "a has" : "no";
        String paw = "paw";
        if (numberOfPaws > 1) paw += 's';
        return "This animal is mostly " + color + ". It has " + numberOfPaws + paw + fur + " fur.";
    }

    public boolean isHasFur() {
        return hasFur;
    }
}
