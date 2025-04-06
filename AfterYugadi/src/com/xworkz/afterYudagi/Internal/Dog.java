package com.xworkz.afterYudagi.Internal;

public class Dog extends Animal{
    public Dog()
    {
        System.out.println("no arg const of dog");
    }
    @Override
    public void eat()
    {
        System.out.println("Eat in animal");
    }
    @Override
    public  void sleep()
    {
        System.out.println("sleep in animal");
    }
    @Override
    public  void makeSound()
    {
        System.out.println("Sound in animal");
    }
    @Override
    public void run()
    {
        System.out.println("Run");
    }
    @Override
    public void  walk()
    {
        System.out.println("Walk");
    }
}
