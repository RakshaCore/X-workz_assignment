package com.xworkz.HeavyDriver.Internal;

public class DocToPdfConverter implements FileConverter {
    @Override
    public void convertToPDF() {
        System.out.println("Converting document to PDF...");
    }

    @Override
    public void convertToWord() {
        System.out.println("Converting document to Word...");
    }

    @Override
    public void convertToExcel() {
        System.out.println("Converting document to Excel...");
    }
    @Override
    public void convert() {
        System.out.println("Converting document to default format...");
    }

}
