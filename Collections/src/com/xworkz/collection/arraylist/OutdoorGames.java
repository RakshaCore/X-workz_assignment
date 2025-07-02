package com.xworkz.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class OutdoorGames {
    public static void main() {
        Collection<String> outdoorGames= new ArrayList<>();
        outdoorGames.add("Cricket");
        outdoorGames.add("Football");
        outdoorGames.add("Hockey");
        outdoorGames.add("Basketball");
        outdoorGames.add("Volleyball");
        outdoorGames.add("Tennis");
        outdoorGames.add("Badminton");
        outdoorGames.add("Baseball");
        outdoorGames.add("Table Tennis");
        outdoorGames.add("Ko-KO");
        System.out.println("Size of the collection: " + outdoorGames.size());
        System.out.println("Outdoor Games: " + outdoorGames);
        outdoorGames.clear();
        System.out.println("Size of the collection after clear: " + outdoorGames.size());
        System.out.println("Outdoor Games after clear: " + outdoorGames);
        outdoorGames.add("Cricket");
        outdoorGames.add("Football");
        outdoorGames.add("Hockey");
        outdoorGames.add("Basketball");
        outdoorGames.add("Volleyball");
        outdoorGames.add("Tennis");
        outdoorGames.add("Badminton");
        outdoorGames.add("Baseball");
        outdoorGames.add("Table Tennis");
        outdoorGames.add("Ko-KO");
        System.out.println("Size of the collection: " + outdoorGames.size());
        System.out.println("Outdoor Games: " + outdoorGames);

    }
}
