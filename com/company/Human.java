package com.company;

import java.sql.SQLOutput;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    private Double salary;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car, Double price) {
        if (price > (getSalary() * 5)) {
            System.out.println("YO MAMA SO POOR...");
        } else if (price > getSalary()) {
            System.out.println("Leasing is legal stealing...");
        } else {
            System.out.println("Make it rain - bought in cash");
        }
        this.car = car;
    }
}
