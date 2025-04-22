package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.File;

public class FileReader {
    private File file;
    public FileReader(File file) {
        this.file = file;
        System.out.println("Running FileReader");
    }
    public void readFile() {
        if (this.file != null) {
            this.file.read();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
