package com.xworkz.HeavyDriver.Internal;

public interface Cook {
    void cook();

    void bake();

    void grill();

    default void displayCookingSkills() {
        System.out.println("Displaying cooking skills...");
    }
}
