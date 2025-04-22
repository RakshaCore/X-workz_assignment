package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Transport;

public class TransportHub {
    private Transport transport;
    public TransportHub(Transport transport) {
        this.transport = transport;
        System.out.println("Running TransportHub");
    }
    public void transport() {
        if (this.transport != null) {
            this.transport.start();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
