package com.xworkz.bt.internal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Designation {
    private String designationName;
    private String department;
    private String jobDescription;
    private int level;

    private  Role role;
}
