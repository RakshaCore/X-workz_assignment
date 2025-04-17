package com.xworkz.HeavyDriver.Internal;

public class MovieRecommender implements RecommendationEngine {
    @Override
    public void recommendProducts() {
        System.out.println("Recommending movies based on user preferences.");
    }

    @Override
    public void analyzeUserBehavior() {
        System.out.println("Analyzing user behavior to improve recommendations.");
    }

    @Override
    public void providePersonalizedRecommendations() {
        System.out.println("Providing personalized movie recommendations.");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending movies with default method.");
    }
}
