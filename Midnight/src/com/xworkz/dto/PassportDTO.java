package com.xworkz.dto;

import java.io.Serializable;

public class PassportDTO implements Serializable {
    private String applicantName;
    private String aadharNo;
    private String address;
    private String panNo;
    private String country;
    private String state;
    private String city;
    private String pinCode;
    private String passportType;
    private String paymentRefNo;

    public PassportDTO(String applicantName, String aadharNo, String address, String panNo, String country,
                       String state, String city, String pinCode, String passportType, String paymentRefNo) {
        this.applicantName = applicantName;
        this.aadharNo = aadharNo;
        this.address = address;
        this.panNo = panNo;
        this.country = country;
        this.state = state;
        this.city = city;
        this.pinCode = pinCode;
        this.passportType = passportType;
        this.paymentRefNo = paymentRefNo;
    }

    public String getApplicantName() { return applicantName; }
    public String getAadharNo() { return aadharNo; }
    public String getAddress() { return address; }
    public String getPanNo() { return panNo; }
    public String getCountry() { return country; }
    public String getState() { return state; }
    public String getCity() { return city; }
    public String getPinCode() { return pinCode; }
    public String getPassportType() { return passportType; }
    public String getPaymentRefNo() { return paymentRefNo; }
}

