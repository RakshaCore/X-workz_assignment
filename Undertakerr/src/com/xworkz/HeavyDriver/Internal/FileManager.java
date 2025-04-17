package com.xworkz.HeavyDriver.Internal;

public interface FileManager {
    void uploadFile();

    void downloadFile();

    void deleteFile();
    default void logFileOperation() {
        System.out.println("Logging file operation...");
    }
}
