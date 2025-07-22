package com.xworkz.bt.internal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class House {
    private String ownerName;
    private String address;
    private int numberOfRooms;
    private double areaInSquareFeet;

    private Details details;
}
