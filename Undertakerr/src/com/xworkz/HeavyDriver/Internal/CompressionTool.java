package com.xworkz.HeavyDriver.Internal;

public interface CompressionTool {
    void compress();

    void decompress();

    void merge();

    default void logCompression() {
        System.out.println("Logging compression activity...");
    }
}
