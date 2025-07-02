package com.xworkz.phonebook.dto;

import java.io.Serializable;

public class PhoneBookDTO implements Serializable {
    String fullName;
    String phoneNumber;
    String email;

    public PhoneBookDTO( String fullName, String phoneNumber, String email) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
