package com.xworkz.HeavyDriver.Internal;

public interface ReportGenerator {
    void generateReport();
    void generateErrorReport();
    void generateWarningReport();

    default void generateInfoReport() {
        System.out.println("Generating info report...");
    }
}
