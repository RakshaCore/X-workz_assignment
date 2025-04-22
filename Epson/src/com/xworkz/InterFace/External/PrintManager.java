package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Printer;

public class PrintManager {
    private Printer printer;

    public PrintManager(Printer printer) {
        this.printer = printer;
        System.out.println("Running PrintManager");
    }


    public void use() {
        if (this.printer != null) {
            this.printer.printpg();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
