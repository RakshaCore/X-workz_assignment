package com.xworkz.bt.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class PrimeMinister {
    private String name;
    private String party;
    private String age;
    private String education;

    private  Constituency constituency;


}
