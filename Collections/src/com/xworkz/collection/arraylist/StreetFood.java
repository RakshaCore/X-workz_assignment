package com.xworkz.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class StreetFood {
    public static void main() {
        Collection<String> streetFood = new ArrayList<>();
        streetFood.add("Vada Pav");
        streetFood.add("Pani Puri");
        streetFood.add("Shawarma");
        streetFood.add("Dosa");
        streetFood.add("Kaati Rolls");
        streetFood.add("Samosa");
        streetFood.add("Egg Roll");
        streetFood.add("Bhel Puri");
        streetFood.add("Chaat");
        streetFood.add("Pav Bhaji");
        System.out.println("Size of the collection: " + streetFood.size());
        System.out.println("Street Food Items: " + streetFood);
        streetFood.clear();
        System.out.println("Size of the collection after clear: " + streetFood.size());
        System.out.println("Street Food Items after clear: " + streetFood);
        streetFood.add("Vada Pav");
        streetFood.add("Pani Puri");
        streetFood.add("Shawarma");
        streetFood.add("Dosa");
        streetFood.add("Kaati Rolls");
        streetFood.add("Samosa");
        streetFood.add("Egg Roll");
        streetFood.add("Bhel Puri");
        streetFood.add("Chaat");
        streetFood.add("Pav Bhaji");
        System.out.println("Size of the collection after re-adding: " + streetFood.size());
        System.out.println("Street Food Items: " + streetFood);
    }
}
