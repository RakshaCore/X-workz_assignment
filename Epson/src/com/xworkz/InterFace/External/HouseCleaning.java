package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Service;

public class HouseCleaning {
    private Service service;
    public HouseCleaning(Service service) {
        this.service = service;
        System.out.println("Running HouseCleaning");
    }
    public void cleanit() {
        if (this.service != null) {
            this.service.clean();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
