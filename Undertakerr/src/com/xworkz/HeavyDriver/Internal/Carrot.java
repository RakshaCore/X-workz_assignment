package com.xworkz.HeavyDriver.Internal;

public class Carrot implements Vegetable {

    @Override
    public void getVegetableName() {
        System.out.println("Carrot");
    }

    @Override
    public void getVegetableColor() {
        System.out.println("Orange");
    }

    @Override
    public void getVegetableTaste() {
        System.out.println("Sweet");
    }
    @Override
    public void getVegetableShape() {
        System.out.println("The carrot is long and cylindrical.");
    }

}
