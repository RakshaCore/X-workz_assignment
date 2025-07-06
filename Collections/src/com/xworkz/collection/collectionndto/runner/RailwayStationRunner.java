package com.xworkz.collection.collectionndto.runner;

import com.xworkz.collection.collectionndto.dto.RailwayStationDTO;

import java.util.ArrayList;
import java.util.Collection;

public class RailwayStationRunner {
    public static void main(String[] args) {
        Collection < RailwayStationDTO> railwayStations=new ArrayList<>();
        railwayStations.add(new RailwayStationDTO("Karwar", "Karnataka", 581301, 12.6111, 74.1234));
        railwayStations.add(new RailwayStationDTO("Hubli", "Karnataka", 580020, 15.3522, 75.1234));
        railwayStations.add(new RailwayStationDTO("Dharwad", "Karnataka", 580001, 15.4567, 75.1234));
        railwayStations.add(new RailwayStationDTO("Bangalore", "Karnataka", 560001, 12.9716, 77.5946));
        railwayStations.add(new RailwayStationDTO("Mysore", "Karnataka", 570001, 12.2958, 76.6394));
        railwayStations.add(new RailwayStationDTO("Chennai", "Tamil Nadu", 600001, 13.0827, 80.2707));
        railwayStations.add(new RailwayStationDTO("Mumbai", "Maharashtra", 400001, 19.0760, 72.8777));
        railwayStations.add(new RailwayStationDTO("Delhi", "Delhi", 110001, 28.6139, 77.2090));
        railwayStations.add(new RailwayStationDTO("Kolkata", "West Bengal", 700001, 22.5726, 88.3639));
        railwayStations.add(new RailwayStationDTO("Pune", "Maharashtra", 411001, 18.5204, 73.8567));


        for(RailwayStationDTO stationDTO: railwayStations)
        {
            System.out.println("Station Name:"+stationDTO.getName());
                     System.out.println("Pin Code:"+stationDTO.getCode());
            System.out.println("--------------------------------------------------");

        }
    }
}
