package com.xworkz.morning.dto;
import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class SoftToyDTO implements Comparable<SoftToyDTO>{


    private int id;
    private String color;
    private String type;
    private String size;

    @Override
    public int compareTo(SoftToyDTO o) {
        if(this.id> o.id) {
            return 1;
        } else if(this.id < o.id) {
            return -1;
        } else {
            return 0;
        }
    }
}
