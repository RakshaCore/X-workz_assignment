package com.xworkz.HeavyDriver.Internal;

public interface DataExporter {
    void exportData();
    void importData();
    void deleteData();
    default void logExport() {
        System.out.println("Logging export...");
    }
}
