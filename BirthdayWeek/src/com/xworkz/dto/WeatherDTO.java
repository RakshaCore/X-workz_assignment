package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class WeatherDTO implements Serializable {

    private String locationName;
    private String capturedBy;
    private int temperature;
    private LocalDate recorded;

    public WeatherDTO() {
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getCapturedBy() {
        return capturedBy;
    }

    public void setCapturedBy(String capturedBy) {
        this.capturedBy = capturedBy;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public LocalDate getRecorded() {
        return recorded;
    }

    public void setRecorded(LocalDate recorded) {
        if (recorded != null) {
            this.recorded = recorded;
        }else
            throw new IllegalArgumentException("Recorded date cannot be null");
    }
}
