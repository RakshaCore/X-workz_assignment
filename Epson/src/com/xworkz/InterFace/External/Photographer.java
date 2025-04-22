package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Camera;

public class Photographer {
    private Camera camera;
    public Photographer(Camera camera) {
        this.camera = camera;
        System.out.println("Running Photographer");
    }
    public void capture() {
        if (this.camera != null) {
            this.camera.clickPhoto();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
