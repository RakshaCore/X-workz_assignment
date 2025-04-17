package com.xworkz.HeavyDriver.Internal;

public interface CloudStorage {
    void uploadFile();
    void downloadFile();
    void deleteFile();
    default void shareFile() {
        System.out.println("Sharing file from cloud storage...");
    }
}
