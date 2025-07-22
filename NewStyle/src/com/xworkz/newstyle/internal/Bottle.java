package com.xworkz.newstyle.internal;

import java.io.Serializable;

public class Bottle implements Cloneable, Serializable {
    private String name;
    private String color;
    private int price;
    private String brand;

    public Bottle(String name, String color, int price, String brand) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
