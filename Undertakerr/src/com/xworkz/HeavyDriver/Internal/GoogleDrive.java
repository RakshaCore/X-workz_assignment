package com.xworkz.HeavyDriver.Internal;

public class GoogleDrive implements CloudStorage {

    @Override
    public void uploadFile() {
        System.out.println("Uploading file to Google Drive...");
    }

    @Override
    public void downloadFile() {
        System.out.println("Downloading file from Google Drive...");
    }

    @Override
    public void deleteFile() {
        System.out.println("Deleting file from Google Drive...");
    }
}
