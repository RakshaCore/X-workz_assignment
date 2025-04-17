package com.xworkz.HeavyDriver.Internal;

public interface Vegetable {
    void getVegetableName();

    void getVegetableColor();

    void getVegetableTaste();
    default void getVegetableShape() {
        System.out.println("The vegetable is in a specific shape.");
    }
}
