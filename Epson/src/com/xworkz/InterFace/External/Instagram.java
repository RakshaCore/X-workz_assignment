package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.App;

public class Instagram {
    private App app;
    public Instagram(App app) {
        this.app = app;
        System.out.println("Running Instagram");
    }
    public void open() {
        if (this.app != null) {
            this.app.install();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
