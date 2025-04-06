package com.xworkz.afterYudagi.Internal;

public class AISmartMirror extends SmartMirror{
    public AISmartMirror() {
        System.out.println("AI-Based Smart Mirror Activated");
    }
@Override
    public void displayWeather() {
        System.out.println("Displaying today's weather forecast");
    }
@Override
    public void showNewsHeadlines() {
        System.out.println("Showing latest news headlines");
    }
@Override
    public void analyzeSkinCondition() {
        System.out.println("Analyzing user's skin condition and providing skincare tips");
    }
@Override
    public void suggestOutfits() {
        System.out.println("Suggesting outfit choices based on weather and occasion");
    }
@Override
    public void playMusic() {
        System.out.println("Playing music based on user's mood");
    }
}
