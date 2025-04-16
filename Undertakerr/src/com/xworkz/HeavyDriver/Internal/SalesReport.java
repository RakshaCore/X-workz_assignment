package com.xworkz.HeavyDriver.Internal;

public class SalesReport implements ReportGenerator {

    @Override
    public String generateReport() {
        return "Sales Report: All sales data is accurate.";
    }

    @Override
    public String generateErrorReport() {
        return "Sales Report: Error in sales data.";
    }

    @Override
    public String generateWarningReport() {
        return "Sales Report: Warning regarding sales data.";
    }
}
