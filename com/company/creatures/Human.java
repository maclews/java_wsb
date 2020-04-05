package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    protected Phone phone;
    public Animal pet;
    private Car car;
    private Double salary;

    public Human(String species) {
        super("Homo sapiens");
        this.setWeight(100.0);
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Car getCar() {
        return car;
    }

    public void shareCar(Car car) {
        this.car = car;
    }

    public void setCar(Car car) {
        if (car.getPrice() > (getSalary() * 5)) {
            System.out.println("YO MAMA SO POOR...");
        } else if (car.getPrice() > getSalary()) {
            System.out.println("Leasing is legal stealing...");
        } else {
            System.out.println("Make it rain - bought in cash");
        }
        this.car = car;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
