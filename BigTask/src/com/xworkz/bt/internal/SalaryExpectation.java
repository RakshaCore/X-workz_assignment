package com.xworkz.bt.internal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class SalaryExpectation {
    private String jobTitle;
    private double expectedSalary;
    private String currency;
    private String salaryFrequency;

    private Bonus bonus;
}
