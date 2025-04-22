package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Shape;

public class DrawingTool {
    private Shape shape;
    public DrawingTool(Shape shape) {
        this.shape = shape;
        System.out.println("Running DrawingTool");
    }
    public void create() {
        if (this.shape != null) {
            this.shape.draw();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
