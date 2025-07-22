package com.xworkz.bt.internal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Details {
    private String name;
    private String email;
    private String phoneNumber;
    private String address;

    private Address addressDetails;

}
