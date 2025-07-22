package com.xworkz.bt.internal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class President {
    private String name;
    private String party;
    private String age;
    private String education;

    private Designation designation;
}
