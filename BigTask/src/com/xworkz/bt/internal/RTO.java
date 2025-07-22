package com.xworkz.bt.internal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class RTO {
    private String location;
    private String code;
    private String state;
    private String country;

    private Inspector inspector;

}
