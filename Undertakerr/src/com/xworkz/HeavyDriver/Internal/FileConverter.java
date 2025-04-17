package com.xworkz.HeavyDriver.Internal;

public interface FileConverter {
    void convertToPDF();

    void convertToWord();

    void convertToExcel();
    default void convert() {
        System.out.println("Converting file to default format...");
    }
}
