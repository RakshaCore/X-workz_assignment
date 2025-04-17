package com.xworkz.HeavyDriver.Internal;

public class SalesReport implements ReportGenerator {
    @Override
    public void generateReport() {
        System.out.println("Generating sales report...");
    }

    @Override
    public void generateErrorReport() {
        System.out.println("Generating sales error report...");
    }

    @Override
    public void generateWarningReport() {
        System.out.println("Generating sales warning report...");
    }

    @Override
    public void generateInfoReport() {
        System.out.println("Generating sales info report...");
    }
}
