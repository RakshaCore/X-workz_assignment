package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Display;

public class Monitor {
    private Display display;
    public Monitor(Display display) {
        this.display = display;
        System.out.println("Running Monitor");
    }
    public void displayProperly() {
        if (this.display != null) {
            this.display.show();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
