package com.softserve.edu04.Homework;

import static com.softserve.edu04.Homework.Dog.getOldestAge;

public class MainDog {
    public static void main(String[] args) {
        Dog d1 = new Dog(Dog.Breed.bulldog, "Tom", 2);
        Dog d2 = new Dog(Dog.Breed.golden_retriever, "Tom", 6);
        Dog d3 = new Dog(Dog.Breed.beagle, "Jack", 4);
        Dog[] Range = {d1, d2, d3};
        for (Dog d : Range) {
            if (d.getAge() == getOldestAge()) {
                System.out.println("The oldest dog - " + d);
            }
        }
        if (d1.equals(d2)) {
            System.out.println("These two dogs have the same name: " + d1 +" and "+ d2);
        }
        if (d1.equals(d3)) {
            System.out.println("These two dogs have the same name: " + d3 +" and "+ d1);
        }
        if (d2.equals(d3)) {
            System.out.println("These two dogs have the same name: "+ d3 +" and "+ d2);
        }
    }
}