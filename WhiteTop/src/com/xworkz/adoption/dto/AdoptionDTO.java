package com.xworkz.adoption.dto;

import java.io.Serializable;

public class AdoptionDTO implements Serializable {
    private String firstName;
    private String lastName;
    private int age;
    private String city;
    private String state;
    private String zip;
    private String maritalStatus;
    private String adoptionType;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getAdoptionType() {
        return adoptionType;
    }

    public AdoptionDTO(String firstName, String lastName, int age, String city, String state, String zip, String maritalStatus, String adoptionType) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.maritalStatus = maritalStatus;
        this.adoptionType = adoptionType;


    }
}
