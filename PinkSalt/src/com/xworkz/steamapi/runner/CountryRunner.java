package com.xworkz.steamapi.runner;

import com.xworkz.steamapi.repository.CountryRepository;
import com.xworkz.steamapi.repository.CountryRepositoryImpl;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class CountryRunner {
    public static void main(String[] args) {

        CountryRepository countryRepository= new CountryRepositoryImpl();
        Collection<String> countries = countryRepository.getAllCountries();

        System.out.println("1. List of All the Countries:");
        for(String country : countries) {
            System.out.println(country);
        }

        System.out.println("2. Countries starting with 'I':");
        countries.stream().filter(e->e.startsWith("I"))
                .forEach(c->System.out.println(c));

        System.out.println("3. Countries starts with 'G':");
        countries.stream().filter(e->e.startsWith("G"))
                .forEach(c->System.out.println(c));

        System.out.println("4. Countries ending with a :");
        countries.stream().filter(e->e.endsWith("a"))
                .forEach(c->System.out.println(c));

        System.out.println("5. Countries in Descending order:");
        countries.stream().sorted(Comparator.reverseOrder()).forEach(c -> System.out.println("Country Name :" + c));

        System.out.println("6. Countries in Ascending order:");
        countries.stream().sorted().forEach(c -> System.out.println("Country Name :" + c));

        System.out.println("7. Countries with length greater than 6:");
        countries.stream().filter(e -> e.length() > 6).forEach(c -> System.out.println("Country Name :" + c));

        System.out.println("8. Countries with length less than 4:");
        countries.stream().filter(e -> e.length() < 4).forEach(c -> System.out.println("Country Name :" + c));

        System.out.println("9. Countries with O in it:");
        Collection<String> list=countries.stream().filter(e->e.contains("o")).collect(Collectors.toList());
        for(String country : list) {
            System.out.println(country);
        }

        System.out.println("10. Countries with a charcter occurence more than once:");
        countries.stream().filter((e)->e.toLowerCase().chars().anyMatch(value->e.toLowerCase().indexOf(value) != e.toLowerCase().lastIndexOf(value)))
                .forEach(c -> System.out.println("Country Name :" + c));


        System.out.println("11. Reverse of all the countries:");
        countries.stream().map((c) -> {
            String rev = "";
            for (int i = c.length() - 1; i >= 0; i--) {
                rev = rev + c.charAt(i);
            }
            return rev;//it returns a string so we use map() sincein filter() only boolen is returned
        }).forEach(e -> System.out.println("Country Reverse  Name " + e));

        System.out.println("12. Countries which are Palindrome:");
        countries.stream().filter(c -> {
            String reversed = new StringBuilder(c).reverse().toString();
            return c.equalsIgnoreCase(reversed);
        }).forEach(c -> System.out.println("Country Name :" + c));

        System.out.println("13. Countries with their length:");
        countries.stream().map(c -> c + " - " + c.length())
                .forEach(c -> System.out.println("Country Name and Length :" + c));


    }
}
