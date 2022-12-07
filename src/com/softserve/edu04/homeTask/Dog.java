package com.softserve.edu04.homeTask;

import java.util.ArrayList;

public class Dog {
    private String name;
    private Breed breed;
    private int age;
    private static int maxAge = Integer.MIN_VALUE;
    private static boolean checkName = false;
    private static ArrayList<Dog> arr = new ArrayList<>();

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;

        for (Dog dog : arr)
            if (dog.getName().equals(name)) {
                checkName = true;
                break;
            }

        if (age > maxAge) maxAge = age;

        arr.add(this);
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public static boolean checkRepeats() {

        return checkName;
    }

    public static void checkOldest() {
        for (Dog dog : arr) if (dog.getAge() == maxAge) System.out.println(dog.getBreed() + " " + dog.getName() + " is the oldest dog, " + dog.getAge() + " years" );
    }
}

enum Breed {
    Terrier, Spaniel, Shepherd, Beagle, Bulldog, Chihuahua

}
