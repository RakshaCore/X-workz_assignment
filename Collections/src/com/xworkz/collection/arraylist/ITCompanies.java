package com.xworkz.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class ITCompanies {
    public static void main() {
        Collection<String> itCompanies=new ArrayList<>();
        itCompanies.add("TCS");
        itCompanies.add("Infosys");
        itCompanies.add("Wipro");
        itCompanies.add("HCL");
        itCompanies.add("Tech Mahindra");
        itCompanies.add("Accenture");
        itCompanies.add("Cognizant");
        itCompanies.add("Capgemini");
        itCompanies.add("IBM");
        itCompanies.add("Oracle");
        System.out.println("Size of the collection: " + itCompanies.size());
        System.out.println("IT Companies: " + itCompanies);
        itCompanies.clear();
        System.out.println("Size of the collection after clear: " + itCompanies.size());
        System.out.println("IT Companies after clear: " + itCompanies);
        itCompanies.add("TCS");
        itCompanies.add("Infosys");
        itCompanies.add("Wipro");
        itCompanies.add("HCL");
        itCompanies.add("Tech Mahindra");
        itCompanies.add("Accenture");
        itCompanies.add("Cognizant");
        itCompanies.add("Capgemini");
        itCompanies.add("IBM");
        itCompanies.add("Oracle");
        System.out.println("Size : " + itCompanies.size());
        System.out.println("IT Companies: " + itCompanies);
    }
}
