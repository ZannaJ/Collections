package com.company;

public enum MathConstants {

    PI(Math.PI),
    AVOGADRO_CONSTANT(6.02);

    // create properties to hold these values.
    private final double number;

    // Constructor
    MathConstants(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    // Aggregation - means that one object is a
    // part of another object. (the two objects do not depend on one another).
    // Composition - means an aggregation where the one object depends othet.
}
