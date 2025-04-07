package com.xworkz.afterYudagi.Internal;

public class OnlineWeatherStation extends WeatherStation{
    public OnlineWeatherStation() {
        System.out.println("OnlineWeatherStation Constructor");
    }
    @Override
    public void collectData() {
        System.out.println("Online WeatherStation is collecting weather data");
    }
    @Override
    public void analyzeTrends() {
        System.out.println("Online WeatherStation is analyzing trends");
    }
    @Override
    public void generateForecast() {
        System.out.println("Online WeatherStation is generating a forecast");
    }
    @Override
    public void issueWarnings() {
        System.out.println("Online WeatherStation is issuing weather warnings");
    }
    @Override
    public void provideClimateReports() {
        System.out.println("Online WeatherStation is providing climate reports");
    }
    public void checkFacts()
    {
        System.out.println("Yessssssssss");
    }
}
