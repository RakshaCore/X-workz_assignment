package com.xworkz.bt.internal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Mayor {
    private String name;
    private String city;
    private String party;
    private int termYears;

    private  Vehicle vehicle;
}
