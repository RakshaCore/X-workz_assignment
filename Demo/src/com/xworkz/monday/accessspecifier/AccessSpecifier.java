package com.xworkz.monday.accessspecifier;
public class AccessSpecifier
{
    public int age=21;
    private String name ="Raksha";
    String color="Black";
     public void demoPublic()
     {
         System.out.println("Public method accessed");
     }
     private void demoPrivate()
     {
         System.out.println("Private method accessed");
     }
     void packageLevel()
     {
         System.out.println("Package level method accessed");
     }
     public void accessPublic(int age)
     {
         System.out.println("Age is"+age);
     }
     public void accessPrivate(String name)
     {
         System.out.println("Name is"+name);
     }
    public void accessDefault(String color)
    {
        System.out.println("Color is"+color);
    }
}
