package com.xworkz.morning.runner;

import com.xworkz.morning.dto.BagDTO;

import java.util.ArrayList;
import java.util.List;

public class BagRunner {
    public static void main(String[] args) {
        List<BagDTO> list=new ArrayList<>();
        BagDTO bag1 = new BagDTO(101, "Nike");
        BagDTO bag2 = new BagDTO(102, "Adidas");
        BagDTO bag3 = new BagDTO(103, "Puma");
        BagDTO bag4 = new BagDTO(104, "Reebok");

        list.add(bag1);
        list.add(bag2);
        list.add(bag3);
        list.add(bag4);


        System.out.println("Before Sorting");

        list.forEach(System.out::println);;

        System.out.println("After Sorting");
        list.stream().sorted().forEach(System.out::println);
    }
}
