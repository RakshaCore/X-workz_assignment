package com.xworkz.HeavyDriver.Internal;

public interface ImageProcessor {
    void processImage();
    void resizeImage();
    void filterImage();
    default void displayImage() {
        System.out.println("Displaying image...");
    }
}
