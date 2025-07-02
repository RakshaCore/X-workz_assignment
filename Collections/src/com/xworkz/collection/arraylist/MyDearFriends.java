package com.xworkz.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class MyDearFriends {
    public static void main() {
        Collection<String> myFriends=new ArrayList<>();
        myFriends.add("Apoorva");
        myFriends.add("Kajal");
        myFriends.add("Roshan");
        myFriends.add("Vaibhav B");
        myFriends.add("Vaibhav N");
        myFriends.add("Sneha");
        myFriends.add("Hreshikesh");
        myFriends.add("Abhishek");
        myFriends.add("ChiraShree");
        myFriends.add("ThusharaShree");
        System.out.println("Size of the collection: " + myFriends.size());
        System.out.println("My Friends: " + myFriends);
        myFriends.clear();
        System.out.println("Size of the collection after clear: " + myFriends.size());
        System.out.println("My Friends after clear: " + myFriends);
        myFriends.add("Apoorva");
        myFriends.add("Kajal");
        myFriends.add("Roshan");
        myFriends.add("Vaibhav B");
        myFriends.add("Vaibhav N");
        myFriends.add("Sneha");
        myFriends.add("Hreshikesh");
        myFriends.add("Abhishek");
        myFriends.add("ChiraShree");
        myFriends.add("ThusharaShree");
        System.out.println("Size of the collection: " + myFriends.size());
        System.out.println("My Friends: " + myFriends);

    }
}
