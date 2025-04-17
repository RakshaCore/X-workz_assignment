package com.xworkz.HeavyDriver.Internal;

public interface RecommendationEngine {
    void recommendProducts();

    void analyzeUserBehavior();

    void providePersonalizedRecommendations();
    default void recommend() {
        System.out.println("Recommending products based on user preferences.");
    }
}
