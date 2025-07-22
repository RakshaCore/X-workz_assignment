package com.xworkz.xworkz.map.internal;

import com.xworkz.xworkz.map.external.DressDTO;

import java.util.HashMap;
import java.util.Map;

public class DressRunner {

    public static void main(String[] args) {

        Map<String, DressDTO> map = new HashMap<>();

        DressDTO dressDTO = new DressDTO("Red", 1000, "L");
        DressDTO dressDTO1 = new DressDTO("White", 1200, "M");
        DressDTO dressDTO2 = new DressDTO("Blue", 1500, "XL");

        map.put("Puma", dressDTO);
        map.put("Snitch", dressDTO1);
        map.put("CK", dressDTO2);

        for (Map.Entry<String, DressDTO> ref : map.entrySet() ){

            System.out.println("Brand : " + ref.getKey() + " | Details : " + ref.getValue());

        }

    }

}
