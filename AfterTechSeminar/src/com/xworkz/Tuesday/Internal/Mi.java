package com.xworkz.Tuesday.Internal;

public abstract class Mi extends Phone {
    public Mi(String brand, String color, int price) {
        super(brand, color, price);
    }

    public void miUI() {
        System.out.println("MIUI loaded.");
    }
}

class Realme extends Mi {
    public Realme(String brand, String color, int price) {
        super(brand, color, price);
    }

    @Override
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
    }
}