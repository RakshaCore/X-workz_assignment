package com.xworkz.InterFace.External;
import com.xworkz.InterFace.Internal.Beverage;

public class Cafe {
    Beverage beverage;
    public Cafe(Beverage beverage) {
        this.beverage = beverage;
        System.out.println("Running Cafe");
    }
    public void serve() {
        if (this.beverage != null) {
            this.beverage.drink();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
