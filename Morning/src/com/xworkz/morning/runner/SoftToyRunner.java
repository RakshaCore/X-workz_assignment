package com.xworkz.morning.runner;

import com.xworkz.morning.dto.SoftToyDTO;

import java.util.ArrayList;
import java.util.List;

public class SoftToyRunner {
    public static void main(String[] args) {
        List<SoftToyDTO> softToys = new ArrayList<>();

        softToys.add(new SoftToyDTO(1, "Tie-Dye", "Teddy-Bear", "Medium"));
        softToys.add(new SoftToyDTO(2, "Pink", "Teddy", "Small"));
        softToys.add(new SoftToyDTO(3, "White", "PolarBear", "Medium"));
        softToys.add(new SoftToyDTO(4, "DarkBrown", "TeddyBear", "Large"));

        System.out.println("Before Sorting:");
        softToys.forEach(System.out::println);

        System.out.println("After Sorting:");
        softToys.stream().sorted().forEach(System.out::println);


    }
}
