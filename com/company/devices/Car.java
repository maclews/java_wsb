package com.company.devices;

public class Car extends Device {
    public final Integer displacement;
    public final String engine;

    public Car(String make, String model, Integer year, Integer displacement, String engine, Double price) {
        super("car", make, model, year, price);
        this.displacement = displacement;
        this.engine = engine;
    }

    public String toString() {
        return this.getMake() + " " + this.getModel() + " (" + this.getYear() + ")";
    }
}
