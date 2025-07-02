package com.xworkz.collection.collectionndto.runner;

import com.xworkz.collection.collectionndto.dto.StreetFoodDTO;

import java.util.ArrayList;
import java.util.Collection;

public class StreetFoodRunner {
    public static void main(String[] args) {
        Collection<StreetFoodDTO> streetFoods = new ArrayList<>();
        streetFoods.add(new StreetFoodDTO("Pani Puri", "Snack", true, "Very Popular", "Served in small cups", "Anytime", "$1-$2"));
        streetFoods.add(new StreetFoodDTO("Vada Pav", "Burger", true, "Extremely Popular", "Served in a bun", "Evening", "$1-$2"));
        streetFoods.add(new StreetFoodDTO("Dosa", "Crepe", false, "Very Popular", "Served with chutney", "Breakfast", "$2-$3"));
        streetFoods.add(new StreetFoodDTO("Bhel Puri", "Snack", false, "Popular", "Served in a bowl", "Evening", "$1-$2"));
        streetFoods.add(new StreetFoodDTO("Chaat", "Snack", true, "Very Popular", "Served in a plate", "Anytime", "$1-$3"));
        streetFoods.add(new StreetFoodDTO("Pav Bhaji", "Vegetable Mash", true, "Very Popular", "Served with bread", "Evening", "$2-$4"));
        streetFoods.add(new StreetFoodDTO("Kebabs", "Grilled Meat", true, "Popular", "Served on skewers", "Evening", "$3-$5"));
        streetFoods.add(new StreetFoodDTO("Samosa", "Pastry", true, "Very Popular", "Served with chutney", "Anytime", "$1-$2"));
        streetFoods.add(new StreetFoodDTO("Idli", "Steamed Rice Cake", false, "Popular", "Served with chutney", "Breakfast", "$1-$2"));
        streetFoods.add(new StreetFoodDTO("Pongal", "Rice Dish", false, "Popular", "Served with chutney", "Breakfast", "$2-$3"));

        for (StreetFoodDTO food : streetFoods) {
            System.out.println("Name: " + food.getName());
            System.out.println("Type: " + food.getType());
            System.out.println("Spicyness: " + food.isSpicyness());
            System.out.println("Popularity: " + food.getPopularity());
            System.out.println("Serving Style: " + food.getServingStyle());
            System.out.println("Best Time to Eat: " + food.getBestTimeToEat());
            System.out.println("Price Range: " + food.getPriceRange());
            System.out.println("-------------------------------");
        }

    }
}
