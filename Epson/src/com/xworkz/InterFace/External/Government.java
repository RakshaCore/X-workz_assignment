package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Constitution;

public class Government {
    private Constitution constitution;
    public Government(Constitution constitution) {
        System.out.println("Running Government in Government");
        this.constitution = constitution;
    }
    public void scam() {
        if (this.constitution != null) {
            this.constitution.followLaws();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
