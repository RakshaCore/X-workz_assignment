package com.xworkz.bt.internal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Registration {
    private String ownerName;
    private String vehicleNumber;
    private String vehicleType;
    private String registrationDate;

    private  RTO rto;
}
