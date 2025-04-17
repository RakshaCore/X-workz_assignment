package com.xworkz.HeavyDriver.Internal;

public interface Analyzer {
    void analyze();
    void interpret();
    void report();
    default void logAnalysis() {
        System.out.println("Logging analysis...");
    }
}
