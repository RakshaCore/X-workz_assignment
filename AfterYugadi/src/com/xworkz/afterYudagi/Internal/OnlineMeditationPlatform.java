package com.xworkz.afterYudagi.Internal;

public class OnlineMeditationPlatform extends MeditationPlatform{
    public OnlineMeditationPlatform() {
        System.out.println("Online Meditation Platform Activated");
    }
    @Override
    public void offerGuidedSessions() {
        System.out.println("Offering guided meditation sessions");
    }
    @Override
    public void trackUserProgress() {
        System.out.println("Tracking user's meditation progress");
    }
    @Override
    public void provideRelaxingMusic() {
        System.out.println("Providing relaxing music for meditation");
    }
    @Override
    public void giveBreathingExercises() {
        System.out.println("Giving breathing exercises for relaxation");
    }
    @Override
    public void saveUserPreferences() {
        System.out.println("Saving user meditation preferences");
    }
}
