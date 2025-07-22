package com.xworkz.bt.internal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Criteria {
    private String jobTitle;
    private String requiredSkills;
    private int yearsOfExperience;
    private String locationPreference;

    private SalaryExpectation salaryExpectation;
}
