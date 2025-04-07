package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.OnlineWeatherStation;
import com.xworkz.afterYudagi.Internal.WeatherStation;

public class PredictWeather {
    public void Weather(WeatherStation weatherStation)
    {
        weatherStation.collectData();
        weatherStation.analyzeTrends();
        weatherStation.generateForecast();
        weatherStation.issueWarnings();
        weatherStation.provideClimateReports();

        if (weatherStation instanceof OnlineWeatherStation)
        {
            OnlineWeatherStation onlineWeatherStation=(OnlineWeatherStation) weatherStation;
            onlineWeatherStation.checkFacts();
        }
    }
}
