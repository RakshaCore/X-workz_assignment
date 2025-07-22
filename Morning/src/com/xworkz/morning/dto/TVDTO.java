package com.xworkz.morning.dto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class TVDTO implements Comparable<TVDTO>{
    private int productCount;
    private String brand;
    private String type;
    private double price;
    private String resolution;


    @Override
    public int compareTo(TVDTO o) {
        if(this.productCount > o.productCount) {
            return 1;
        } else if(this.productCount < o.productCount) {
            return -1;
        } else {
            return 0;
        }
    }
}
