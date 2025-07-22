package com.xworkz.bt.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Bonus {
    private String bonusName;
    private double bonusAmount;
    private String bonusType;
    private String bonusFrequency;

    private VariablePay variablePay;
}
