package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Button;

public class Remote {
    private Button button;
    public Remote(Button button) {
        this.button = button;
        System.out.println("Running Remote");
    }
    public void press() {
        if (this.button != null) {
            this.button.click();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
