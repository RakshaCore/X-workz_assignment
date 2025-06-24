package com.xworkz.raksha.dto;

import java.io.Serializable;

public class RakshaDTO implements Serializable {
    String firstName;
    String lastName;
    String email;

    public RakshaDTO(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
