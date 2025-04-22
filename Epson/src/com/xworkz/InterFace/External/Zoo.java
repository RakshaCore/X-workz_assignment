package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Animal;

public class Zoo {
    Animal animal;
    public Zoo(Animal animal) {
        this.animal = animal;
        System.out.println("Running Zoo");
    }
    public void eat() {
        if (this.animal != null) {
            this.animal.bark();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
