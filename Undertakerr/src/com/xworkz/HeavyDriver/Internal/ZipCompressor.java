package com.xworkz.HeavyDriver.Internal;

public class ZipCompressor implements CompressionTool {
    @Override
    public void compress() {
        System.out.println("Compressing files using Zip compression...");
    }

    @Override
    public void decompress() {
        System.out.println("Decompressing files using Zip compression...");
    }

    @Override
    public void merge() {
        System.out.println("Merging files using Zip compression...");
    }
}
