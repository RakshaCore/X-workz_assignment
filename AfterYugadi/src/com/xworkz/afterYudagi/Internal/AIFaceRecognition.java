package com.xworkz.afterYudagi.Internal;

public class AIFaceRecognition extends FaceRecognition {
    public AIFaceRecognition() {
        System.out.println("AI-Powered Face Recognition System Activated");
    }
    @Override
    public void captureImage() {
        System.out.println("Capturing face image");
    }
@Override
    public void detectFace() {
        System.out.println("Detecting face from image");
    }
@Override
    public void compareWithDatabase() {
        System.out.println("Comparing face with database");
    }
@Override
    public void grantAccess() {
        System.out.println("Granting access based on recognition");
    }
@Override
    public void logEntry() {
        System.out.println("Logging recognized face entry");
    }
}
