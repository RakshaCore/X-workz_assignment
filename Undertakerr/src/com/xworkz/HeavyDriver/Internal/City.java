package com.xworkz.HeavyDriver.Internal;

public interface City {

    void getCityArea();

    void getCityAttractions();

    void getCityWeather();

    default void getCityPopulation() {
        System.out.println("The city has a large population.");
    }
}
