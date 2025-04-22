package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Tool;

public class Hammer {
    private Tool tool;
    public Hammer(Tool tool) {
        this.tool = tool;
        System.out.println("Running Hammer");
    }
    public void useTool() {
        if (this.tool != null) {
            this.tool.use();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
