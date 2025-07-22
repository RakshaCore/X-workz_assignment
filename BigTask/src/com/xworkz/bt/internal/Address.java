package com.xworkz.bt.internal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Address {
    private String street;
    private String city;
    private String state;
    private String postalCode;

    private City cityDetails;
}
