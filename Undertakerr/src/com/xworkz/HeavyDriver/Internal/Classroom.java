package com.xworkz.HeavyDriver.Internal;

public interface Classroom {
    void teach();
    default void learn()
    {
        System.out.println("Learning in the classroom");
    }
     static void study()
    {
        System.out.println("Studying in the classroom");
    }

}
