package com.xworkz.bt.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Constituency {
    private int constituencyNumber;
    private String constituencyName;
    private String constituencyType;
    private String constituencyHead;

    private Ward ward;
}
