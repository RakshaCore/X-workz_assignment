package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Keyboard;

public class TypingApp {
    private Keyboard keyboard;
    public TypingApp(Keyboard keyboard) {
        this.keyboard = keyboard;
        System.out.println("Running TypingApp");
    }
    public void type() {
        if (this.keyboard != null) {
            this.keyboard.type();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
