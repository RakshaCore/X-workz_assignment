package com.xworkz.bt.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Tax {
    private String taxName;
    private double taxRate;
    private String taxType;
    private String taxAuthority;

    private Government government;
}
