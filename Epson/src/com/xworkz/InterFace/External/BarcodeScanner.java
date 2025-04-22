package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Scanner;

public class BarcodeScanner {
    private Scanner scanner;
    public BarcodeScanner(Scanner scanner) {
        this.scanner = scanner;
        System.out.println("Running BarcodeScanner");
    }
    public void scan() {
        if (this.scanner != null) {
            this.scanner.scanBarcode();
        } else {
            System.err.println("NULLLLL");
        }
    }

}
