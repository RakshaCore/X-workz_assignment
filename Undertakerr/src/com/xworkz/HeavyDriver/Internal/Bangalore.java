package com.xworkz.HeavyDriver.Internal;

public class Bangalore implements City {

    @Override
    public void getCityArea() {
        System.out.println("Bangalore has a total area of 709 square kilometers.");
    }

    @Override
    public void getCityAttractions() {
        System.out.println("Bangalore is known for its parks, gardens, and IT industry.");
    }

    @Override
    public void getCityWeather() {
        System.out.println("Bangalore has a moderate climate with mild summers and cool winters.");
    }
}
