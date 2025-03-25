package com.xworkz.assignment.innerpackage;

public class PersonRunner {
    public static void main(String[] args) {
        PersonInfo person = new PersonInfo();
        person.showPublic();
        person.showPackageLevel();

       // person.displayPrivate(person.name);
        person.displayDefault(person.city);
        person.displayPublic(person.age);

    }
}
