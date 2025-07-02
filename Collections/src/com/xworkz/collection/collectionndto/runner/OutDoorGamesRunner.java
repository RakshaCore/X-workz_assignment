package com.xworkz.collection.collectionndto.runner;

import com.xworkz.collection.collectionndto.dto.OutdoorGamesDTO;

import java.util.ArrayList;
import java.util.Collection;

public class OutDoorGamesRunner {
    public static void main(String[] args) {
        Collection<OutdoorGamesDTO> outdoorGames = new ArrayList<>();
        outdoorGames.add(new OutdoorGamesDTO("Cricket", "Bat-and-ball", 11, "England", "Very Popular", "Rules of Cricket", "Cricket Bat, Ball, Wickets", "ICC"));
        outdoorGames.add(new OutdoorGamesDTO("Football", "Team Sport", 11, "England", "Extremely Popular", "Laws of the Game", "Football, Goalposts", "FIFA"));
        outdoorGames.add(new OutdoorGamesDTO("Basketball", "Team Sport", 5, "USA", "Very Popular", "Rules of Basketball", "Basketball, Hoop", "FIBA"));
        outdoorGames.add(new OutdoorGamesDTO("Hockey", "Team Sport", 6, "England", "Popular", "Rules of Hockey", "Hockey Stick, Ball", "FIH"));
        outdoorGames.add(new OutdoorGamesDTO("Tennis", "Racquet Sport", 2, "France", "Very Popular", "Rules of Tennis", "Tennis Racket, Ball", "ITF"));
        outdoorGames.add(new OutdoorGamesDTO("Rugby", "Contact Sport", 15, "England", "Popular", "Laws of Rugby", "Rugby Ball, Goalposts", "World Rugby"));
        outdoorGames.add(new OutdoorGamesDTO("Volleyball", "Team Sport", 6, "USA", "Popular", "Rules of Volleyball", "Volleyball, Net", "FIVB"));
        outdoorGames.add(new OutdoorGamesDTO("Badminton", "Racquet Sport", 2, "England", "Popular", "Rules of Badminton", "Badminton Racket, Shuttlecock", "BWF"));
        outdoorGames.add(new OutdoorGamesDTO("Baseball", "Bat-and-ball", 9, "USA", "Very Popular", "Rules of Baseball", "Baseball Bat, Ball, Glove", "MLB"));
        outdoorGames.add(new OutdoorGamesDTO("Golf", "Precision Sport", 1, "Scotland", "Popular", "Rules of Golf", "Golf Clubs, Ball", "R&A"));

        for (OutdoorGamesDTO game: outdoorGames)
        {
            System.out.println("Name: " + game.getName());
            System.out.println("Type: " + game.getType());
            System.out.println("Players: " + game.getPlayers());
            System.out.println("Origin Country: " + game.getOriginCountry());
            System.out.println("Popularity: " + game.getPopularity());
            System.out.println("Rules: " + game.getRules());
            System.out.println("Equipment: " + game.getEquipment());
            System.out.println("Governing Body: " + game.getGoverningBody());
            System.out.println("-------------------------------");
        }


    }
}
