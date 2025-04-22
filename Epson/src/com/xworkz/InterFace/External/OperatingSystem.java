package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Laptop;

public class OperatingSystem {
    private Laptop laptop;
    public OperatingSystem(Laptop laptop) {
        System.out.println("Running Laptop in Operating System");
        this.laptop = laptop;
    }

    public void setLaptop() {
        if (this.laptop != null) {
            this.laptop.run();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
