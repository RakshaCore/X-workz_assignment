package com.xworkz.HeavyDriver.Internal;

public class Student implements Classroom {
    @Override
    public void teach() {
        System.out.println("Teaching in the classroom");
    }

    @Override
    public void learn() {
        System.out.println("Learning in the student class");
    }
    @Override
    public void logClassroom() {
        System.out.println("Logging student activity...");
    }

}
