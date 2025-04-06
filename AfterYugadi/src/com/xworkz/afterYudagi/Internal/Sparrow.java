package com.xworkz.afterYudagi.Internal;

public class Sparrow extends Bird{
    public Sparrow()  {
        System.out.println("No-argument constructor of Sparrow");
    }
    @Override
    public void fly() {
        System.out.println("Bird can fly");
    }
@Override
    public void sing() {
        System.out.println("Bird is singing");
    }
@Override
    public void eat() {
        System.out.println("Bird is eating");
    }
@Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }
@Override
    public void nest() {
        System.out.println("Bird builds a nest");
    }
}
