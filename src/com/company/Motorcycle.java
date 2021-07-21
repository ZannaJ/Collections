package com.company;

public class Motorcycle implements Vehicle {
    public void horn() {
        System.out.println("Motorcycle Hoooonk!!!");
    }
    public void startEngine() {
        System.out.println("Motorcycle Engine started");
    }
    public void stopEngine() {
        System.out.println("Engine Stopped");
    }
}