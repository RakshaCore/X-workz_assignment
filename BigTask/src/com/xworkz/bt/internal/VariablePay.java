package com.xworkz.bt.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class VariablePay {
    private String payName;
    private double payAmount;
    private String payType;
    private String payFrequency;

    private Tax tax;
}
