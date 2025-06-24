package com.xworkz.smile.dto;

public class AdoptionDTO {
    private String childName;
    private int childAge;
    private String childGender;
    private String adopterName;
    private int adopterAge;
    private String occupation;
    private boolean married;
    private String email;
    private String phone;
    private String address;
    private String reason;

    public AdoptionDTO(String childName, int childAge, String childGender, String adopterName, int adopterAge, String occupation, boolean married, String email, String phone, String address, String reason) {
        this.childName = childName;
        this.childAge = childAge;
        this.childGender = childGender;
        this.adopterName = adopterName;
        this.adopterAge = adopterAge;
        this.occupation = occupation;
        this.married = married;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.reason = reason;
    }

    public String getChildName() {
        return childName;
    }

    public int getChildAge() {
        return childAge;
    }

    public String getChildGender() {
        return childGender;
    }

    public String getAdopterName() {
        return adopterName;
    }

    public int getAdopterAge() {
        return adopterAge;
    }

    public String getOccupation() {
        return occupation;
    }

    public boolean isMarried() {
        return married;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getReason() {
        return reason;
    }
}
