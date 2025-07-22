package com.xworkz.bt.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Government {
    private String typeOfGovernment;
    private String headOfGovernment;
    private String governmentFormationDate;
    private String governmentEndDate;

    private PrimeMinister primeMinister;
}
