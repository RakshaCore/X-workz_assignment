package com.xworkz.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class RailwayStation {
    public static void main() {
        Collection<String> railwayStations= new ArrayList<>();
        railwayStations.add("Karwar");
        railwayStations.add("Hubli");
        railwayStations.add("Dharwad");
        railwayStations.add("Bangalore");
        railwayStations.add("Mysore");
        railwayStations.add("Chennai");
        railwayStations.add("Mumbai");
        railwayStations.add("Delhi");
        railwayStations.add("Kolkata");
        railwayStations.add("Pune");
        System.out.println("Size of the collection: " + railwayStations.size());
        System.out.println("Railway Stations: " + railwayStations);
        railwayStations.clear();
        System.out.println("Size of the collection: " + railwayStations.size());
        System.out.println("Railway Stations: " + railwayStations);
        railwayStations.add("Karwar");
        railwayStations.add("Hubli");
        railwayStations.add("Dharwad");
        railwayStations.add("Bangalore");
        railwayStations.add("Mysore");
        railwayStations.add("Chennai");
        railwayStations.add("Mumbai");
        railwayStations.add("Delhi");
        railwayStations.add("Kolkata");
        railwayStations.add("Pune");
        System.out.println("Size of the collection: " + railwayStations.size());
        System.out.println("Railway Stations: " + railwayStations);

    }
}
