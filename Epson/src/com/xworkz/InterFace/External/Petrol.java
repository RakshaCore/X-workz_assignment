package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Fuel;

public class Petrol {
    private Fuel fuel;
    public Petrol(Fuel fuel) {
        this.fuel = fuel;
        System.out.println("Running Petrol");
    }
    public void burn() {
        if (this.fuel != null) {
            this.fuel.burn();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
