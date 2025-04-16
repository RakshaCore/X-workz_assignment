package com.xworkz.HeavyDriver.Internal;

public class ThumbnailGenerator implements ImageProcessor{
    @Override
    public void processImage() {
        System.out.println("Processing image for thumbnail generation...");
    }

    @Override
    public void resizeImage() {
        System.out.println("Resizing image for thumbnail...");
    }

    @Override
    public void filterImage() {
        System.out.println("Applying filter to image for thumbnail...");
    }
}
