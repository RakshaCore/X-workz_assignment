package com.xworkz.bt.internal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@ToString
@Getter
public class Owner {
    private String name;
    private String email;
    private String phoneNumber;
    private String address;

    private List<House> houses;
}
