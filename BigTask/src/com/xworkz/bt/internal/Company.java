package com.xworkz.bt.internal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@ToString
@Getter
public class Company {
    private String name;
    private String location;
    private String industryType;
    private int establishedYear;

    private List<Owner> owners;
}
