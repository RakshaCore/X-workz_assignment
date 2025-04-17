package com.xworkz.HeavyDriver.Internal;

public class Chef implements Cook  {
    @Override
    public void cook() {
        System.out.println("Chef is cooking.");
    }

    @Override
    public void bake() {
        System.out.println("Chef is baking.");
    }

    @Override
    public void grill() {
        System.out.println("Chef is grilling.");
    }
    @Override
    public void displayCookingSkills() {
        System.out.println("Displaying chef's cooking skills...");
    }

}
