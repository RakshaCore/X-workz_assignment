package com.xworkz.bt.internal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class University {
    private String name;
    private String location;
    private String type;
    private int numberOfFaculties;

    private  President president;

}
