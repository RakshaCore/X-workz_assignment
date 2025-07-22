package com.xworkz.bt.internal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class City {
    private String name;
    private String state;
    private String country;
    private int population;

    private Information information;

}
