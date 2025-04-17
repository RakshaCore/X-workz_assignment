package com.xworkz.HeavyDriver.Internal;

public interface Fruit{
    void getFruitName();

    void getFruitColor();

    void getFruitTaste();
    default void getFruitShape() {
        System.out.println("The fruit is in a specific shape.");
    }
}
