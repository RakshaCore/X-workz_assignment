package com.xworkz.HeavyDriver.Internal;

public class Client implements Processor{
    @Override
    public void process() {
        System.out.println("Processing data...");
    }

    @Override
    public void execute() {
        System.out.println("Executing task...");
    }

    @Override
    public void manage() {
        System.out.println("Managing resources...");
    }
}
