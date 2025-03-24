package com.xworkz.assignment.outerpackage;

import com.xworkz.assignment.innerpackage.PersonInfo;

public class PersonRunnerO {
    public static void main(String[] args) {
        PersonInfo person=new PersonInfo();

        person.showPublic();
        System.out.println("Person Age: " + person.age);
    }
}
