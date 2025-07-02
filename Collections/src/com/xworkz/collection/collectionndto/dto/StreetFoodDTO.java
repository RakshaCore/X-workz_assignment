package com.xworkz.collection.collectionndto.dto;

import java.io.Serializable;

public class StreetFoodDTO implements Serializable {
    String name;
    String type;
    boolean spicyness;
    String popularity;
    String servingStyle;
    String bestTimeToEat;
    String priceRange;

    public StreetFoodDTO(String name, String type, boolean spicyness, String popularity, String servingStyle, String bestTimeToEat, String priceRange) {
        this.name = name;
        this.type = type;
        this.spicyness = spicyness;
        this.popularity = popularity;
        this.servingStyle = servingStyle;
        this.bestTimeToEat = bestTimeToEat;
        this.priceRange = priceRange;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isSpicyness() {
        return spicyness;
    }

    public String getPopularity() {
        return popularity;
    }

    public String getServingStyle() {
        return servingStyle;
    }

    public String getBestTimeToEat() {
        return bestTimeToEat;
    }

    public String getPriceRange() {
        return priceRange;
    }
}
