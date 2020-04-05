package com.company.devices;

public class Device {
    private final String make;
    private final String model;
    private final Integer year;
    private final Double price;
    private String type;

    public Device(String type, String make, String model, Integer year, Double price) {
       this.type = type;
       this.make = make;
       this.model = model;
       this.year = year;
       this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public Double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
