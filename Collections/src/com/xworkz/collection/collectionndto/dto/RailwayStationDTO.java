package com.xworkz.collection.collectionndto.dto;

import java.io.Serializable;

public class RailwayStationDTO implements Serializable {
    String name;
    String location;
    String code;
    int platforms;
    String state;
    String stationType;
    String facilities;
    String openingDate;

    public RailwayStationDTO(String name, String location, String code, int platforms, String state, String stationType, String facilities, String openingDate) {
        this.name = name;
        this.location = location;
        this.code = code;
        this.platforms = platforms;
        this.state = state;
        this.stationType = stationType;
        this.facilities = facilities;
        this.openingDate = openingDate;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getCode() {
        return code;
    }

    public int getPlatforms() {
        return platforms;
    }

    public String getState() {
        return state;
    }

    public String getStationType() {
        return stationType;
    }

    public String getFacilities() {
        return facilities;
    }

    public String getOpeningDate() {
        return openingDate;
    }
}
