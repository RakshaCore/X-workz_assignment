package com.xworkz.bt.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@ToString
@Getter
public class Inspector {
    private String name;
    private String department;
    private String rank;
    private String badgeNumber;

    private List<Experience> experience;
}
