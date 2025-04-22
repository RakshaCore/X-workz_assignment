package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Internet;

public class NetworkProvider {
    private Internet internet;
    public NetworkProvider(Internet internet) {
        this.internet = internet;
        System.out.println("Running NetworkProvider");
    }
    public void connect() {
        if (this.internet != null) {
            this.internet.speedTest();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
