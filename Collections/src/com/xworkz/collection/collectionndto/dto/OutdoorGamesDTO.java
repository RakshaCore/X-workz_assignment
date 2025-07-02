package com.xworkz.collection.collectionndto.dto;

import java.io.Serializable;

public class OutdoorGamesDTO implements Serializable {
    String name;
    String type;
    int players;
    String originCountry;
    String popularity;
    String rules;
    String equipment;
    String governingBody;

    public OutdoorGamesDTO(String name, String type, int players, String originCountry, String popularity, String rules, String equipment, String governingBody) {
        this.name = name;
        this.type = type;
        this.players = players;
        this.originCountry = originCountry;
        this.popularity = popularity;
        this.rules = rules;
        this.equipment = equipment;
        this.governingBody = governingBody;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPlayers() {
        return players;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public String getPopularity() {
        return popularity;
    }

    public String getRules() {
        return rules;
    }

    public String getEquipment() {
        return equipment;
    }

    public String getGoverningBody() {
        return governingBody;
    }
}
