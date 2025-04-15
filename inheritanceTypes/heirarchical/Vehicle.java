package com.xworkz.inheritanceTypes.heirarchical;

public class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }
}

