package com.xworkz.HeavyDriver.Internal;
public class XmlDocumentParser implements DocumentParser {
    @Override
    public void parseDocument() {
        System.out.println("Parsing XML document...");
    }

    @Override
    public void validateDocument() {
        System.out.println("Validating XML document...");
    }

    @Override
    public void extractDataFromDocument() {
        System.out.println("Extracting data from XML document...");
    }
}
