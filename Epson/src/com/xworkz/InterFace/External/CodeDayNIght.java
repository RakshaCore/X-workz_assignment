package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Task;

public class CodeDayNIght{
    private Task task;
    public CodeDayNIght(Task task) {
        this.task = task;
        System.out.println("Running CodeDayNIght");
    }
    public void executeit() {
        if (this.task != null) {
            this.task.execute();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
