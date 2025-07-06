package com.xworkz.collection.collectionndto.dto;

import java.io.Serializable;

public class RailwayStationDTO implements Serializable {
    String name;
    String location;
    double code;
    double platforms;
    double platform;

    public RailwayStationDTO(String name, String location, double code, double platform,double platforms) {
        this.name = name;
        this.location = location;
        this.code = code;
        this.platforms = platforms;
        this.platform = platform;

    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getCode() {
        return code;
    }

    public int getPlatforms() {
        return (int) platforms;
    }

}
