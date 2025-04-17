package com.xworkz.HeavyDriver.Internal;

public class CSVExporter implements DataExporter {
    @Override
    public void exportData() {
        System.out.println("Exporting data to CSV format...");
    }

    @Override
    public void importData() {
        System.out.println("Importing data from CSV format...");
    }

    @Override
    public void deleteData() {
        System.out.println("Deleting data in CSV format...");
    }
    @Override
    public void logExport() {
        System.out.println("Logging CSV export...");
    }
}
