package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Machine;

public class WashingMachine {
    private Machine machine;
    public WashingMachine(Machine machine) {
        this.machine = machine;
        System.out.println("Running WashingMachine");
    }
    public void startwashing() {
        if (this.machine != null) {
            this.machine.start();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
