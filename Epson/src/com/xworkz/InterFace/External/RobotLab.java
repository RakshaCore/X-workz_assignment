package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Robot;

public class RobotLab {
    private Robot robot;
    public RobotLab(Robot robot) {
        this.robot = robot;
        System.out.println("Running RobotLab");
    }
    public void work() {
        if (this.robot != null) {
            this.robot.assist();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
