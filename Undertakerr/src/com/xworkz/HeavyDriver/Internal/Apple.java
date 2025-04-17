package com.xworkz.HeavyDriver.Internal;

public class Apple implements Fruit {

    @Override
    public void getFruitName() {
        System.out.println("Apple");
    }

    @Override
    public void getFruitColor() {
        System.out.println("Red");
    }

    @Override
    public void getFruitTaste() {
        System.out.println("Sweet");
    }
    @Override
    public void getFruitShape() {
        System.out.println("The apple is round.");
    }

}
