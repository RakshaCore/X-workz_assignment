package com.xworkz.HeavyDriver.Internal;

public class Robot implements Analyzer{
    @Override
    public void analyze() {
        System.out.println("Analyzing data...");
    }

    @Override
    public void interpret() {
        System.out.println("Interpreting results...");
    }

    @Override
    public void report() {
        System.out.println("Reporting findings...");
    }
    @Override
    public void logAnalysis() {
        System.out.println("Logging robot analysis...");
    }
}
