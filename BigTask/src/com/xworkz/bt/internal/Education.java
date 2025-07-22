package com.xworkz.bt.internal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Education {
    private String board;
    private String stream;
    private String institution;
    private String grade;

    private  University university;
}
