package com.xworkz.bt.internal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Experience {
    private String companyName;
    private String role;
    private int yearsOfExperience;
    private String location;

    private Education education;
}
