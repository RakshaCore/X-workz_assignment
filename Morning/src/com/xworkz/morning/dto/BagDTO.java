package com.xworkz.morning.dto;
import lombok.*;

//@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor

public class BagDTO implements Comparable<BagDTO>{
    public BagDTO(int bagNumber, String brand) {
        this.bagNumber = bagNumber;
        this.brand = brand;
    }

    private int bagNumber;
    private String brand;
    @Override
    public int compareTo(BagDTO o) {
        return Integer.compare(this.bagNumber, o.bagNumber);
    }
}
