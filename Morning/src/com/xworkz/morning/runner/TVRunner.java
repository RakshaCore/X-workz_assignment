package com.xworkz.morning.runner;

import com.xworkz.morning.dto.TVDTO;

import java.util.ArrayList;
import java.util.List;

public class TVRunner {
    public static void main(String[] args) {
        List<TVDTO> tvList=new ArrayList<>();
        tvList.add(new TVDTO(1, "Samsung", "LED", 50000.0, "4K"));
        tvList.add(new TVDTO(2, "LG", "OLED", 80000.0, "4K"));
        tvList.add(new TVDTO(3, "Sony", "QLED", 70000.0, "4K"));
        tvList.add(new TVDTO(4, "OnePlus", "LED", 40000.0, "Full HD"));
        tvList.add(new TVDTO(5, "Mi", "LED", 30000.0, "Full HD"));
        tvList.add(new TVDTO(6, "TCL", "LED", 25000.0, "Full HD"));

        tvList.stream().filter(tv-> tv.getPrice() > 30000.0)
                .sorted()
                .forEach(tv -> System.out.println(tv));
    }
}
