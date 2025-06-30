package com.xworkz.array;

import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {

        String[] names={"Raksha","Deeksha","Bhoomika","Deepika"};

        for(int i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }

        String[] hobbies = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < hobbies.length; i++) {
            hobbies[i] = scanner.nextLine();
        }
        for (int i = 0; i < hobbies.length; i++) {
            System.out.println(hobbies[i]);
        }

        int[] marks = new int[5];
        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 68;
        marks[3] = 35;
        marks[4] = 50;
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        names[1]="Pooja";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
