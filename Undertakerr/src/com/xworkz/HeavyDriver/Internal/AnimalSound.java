package com.xworkz.HeavyDriver.Internal;

public interface AnimalSound {
    void makeSound();

    void eat();

    void sleep();

    default void displayAnimalSound() {
        System.out.println("Displaying animal sound...");
    }

}
