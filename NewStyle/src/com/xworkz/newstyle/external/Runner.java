package com.xworkz.newstyle.external;

import com.xworkz.newstyle.internal.Bottle;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Runner {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Bottle bottle = new Bottle("Water Bottle", "Blue", 500, "BrandX");
        System.out.println("Direct "+bottle);
        Class<?>clazz=Class.forName("com.xworkz.newstyle.internal.Bottle");
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, String.class, int.class, String.class);
        Bottle bottle2 = null;
        try {
            bottle2 = (Bottle) constructor.newInstance("Reflec", "Black", 399, "Reflectify");
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        System.out.println("2. Reflection: " + bottle2);
        Bottle original = new Bottle("CloneMaster", "Silver", 599, "Tupperware");
        Bottle bottle3 = (Bottle) original.clone();
        System.out.println("3. Cloned: " + bottle3);
        Bottle bottle4 = getBottle();
        System.out.println("4. Deserialized: " + bottle4);




    }

    private static Bottle getBottle() throws ClassNotFoundException {
        Bottle bottleToSerialize = new Bottle("SerializeIt", "Red", 199, "SerializeCo");
        String filename = "bottle.ser";

        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(bottleToSerialize);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Bottle bottle4;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            bottle4 = (Bottle) ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return bottle4;
    }
}
