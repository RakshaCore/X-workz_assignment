package com.xworkz.HeavyDriver.Internal;

public interface DocumentParser {
    void parseDocument();

    void validateDocument();

    void extractDataFromDocument();

    default  void displayDocument() {
        System.out.println("Displaying document...");
    }

}
