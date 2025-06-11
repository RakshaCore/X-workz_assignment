package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class DrivingLicenseDTO implements Serializable {
    private String name;
    private String address;
    private String mobile;
    private LocalDate appliedDate;
    private String vehicleType;

    public DrivingLicenseDTO(String name, String address, String mobile, LocalDate appliedDate, String vehicleType) {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.appliedDate = appliedDate;
        this.vehicleType = vehicleType;
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getMobile() { return mobile; }
    public LocalDate getAppliedDate() { return appliedDate; }
    public String getVehicleType() { return vehicleType; }
}
