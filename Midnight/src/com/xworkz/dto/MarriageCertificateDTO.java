package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class MarriageCertificateDTO implements Serializable {
    private String groomName;
    private String brideName;
    private String location;
    private String address;
    private String religion;
    private LocalDate date;
    private String witness1;
    private String witness2;
    private String officerPresent;

    public MarriageCertificateDTO(String groomName, String brideName, String location, String address, String religion,
                                  LocalDate date, String witness1, String witness2, String officerPresent) {
        this.groomName = groomName;
        this.brideName = brideName;
        this.location = location;
        this.address = address;
        this.religion = religion;
        this.date = date;
        this.witness1 = witness1;
        this.witness2 = witness2;
        this.officerPresent = officerPresent;
    }

    public String getGroomName() { return groomName; }
    public String getBrideName() { return brideName; }
    public String getLocation() { return location; }
    public String getAddress() { return address; }
    public String getReligion() { return religion; }
    public LocalDate getDate() { return date; }
    public String getWitness1() { return witness1; }
    public String getWitness2() { return witness2; }
    public String getOfficerPresent() { return officerPresent; }
}
