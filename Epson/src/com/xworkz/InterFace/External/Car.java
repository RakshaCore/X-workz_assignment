package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Engine;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void stop()
    {
        if (this.engine != null) {
            this.engine.start();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
