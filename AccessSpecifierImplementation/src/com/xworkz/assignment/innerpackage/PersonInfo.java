package com.xworkz.assignment.innerpackage;

public class PersonInfo {
    public int age=25;
    private String name="Ajay Devgan";
    String city="Mumbai";

    public void showPublic()
    {
        System.out.println("Hey Im Public");
    }
    private void showPrivate()
    {
        System.out.println("Hey Im Private");
    }
    void showPackageLevel()
    {
        System.out.println("Im package Level Method");
    }
    public void displayPublic(int age)
    {
        System.out.println("Age: "+age);
    }
    public  void displayPrivate(String name){
        System.out.println("Name: "+name);
    }
    public void displayDefault(String city)
    {
        System.out.println("City: "+city);
    }
}
