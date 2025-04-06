package com.xworkz.afterYudagi.Internal;

public class College extends School{
    public College() {
        System.out.println("No-argument constructor: College");
    }
@Override
    public void education() {
        System.out.println("School provides basic education");
    }
@Override
    public void exams() {
        System.out.println("School conducts exams");
    }
@Override
    public void sports() {
        System.out.println("School has sports activities");
    }

    public void teachers() {
        System.out.println("School has teachers");
    }
@Override
    public void uniform() {
        System.out.println("Students wear uniforms");
    }
}
