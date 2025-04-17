package com.xworkz.HeavyDriver.Internal;

public class LocalFileManager implements FileManager {
    @Override
    public void uploadFile() {
        System.out.println("Uploading file to local storage...");
    }

    @Override
    public void downloadFile() {
        System.out.println("Downloading file from local storage...");
    }

    @Override
    public void deleteFile() {
        System.out.println("Deleting file from local storage...");
    }
    @Override
    public void logFileOperation() {
        System.out.println("Logging local file operation...");
    }
}
