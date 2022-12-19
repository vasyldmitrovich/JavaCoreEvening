package com.softserve.edu04.Homework.Two;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Alex", Breed.GermanShepherd, 133);
        Dog dog2 = new Dog("John", Breed.AustralianShepherd, 8);
        Dog dog3 = new Dog("Igor", Breed.Beagle, 122);

        if (dog1.getName().equals(dog2.getName()) | dog1.getName().equals(dog3.getName())) {
            System.out.println("There are two or more dogs with the same name.");
        } else if (dog2.getName().equals(dog1.getName()) | dog2.getName().equals(dog3.getName())) {
            System.out.println("There are two or more dogs with the same name.");
        } else if (dog3.getName().equals(dog1.getName()) | dog3.getName().equals(dog2.getName())) {
            System.out.println("There are two or more dogs with the same name.");
        } else {
            System.out.println("There are no dogs with the same name.");
        }

        if (dog1.getAge() >= dog2.getAge() & dog1.getAge() >= dog3.getAge()) {
            System.out.println("The name of the oldest dog is " + dog1.getName() + " and is a " + dog1.getBreed());
        } else if (dog2.getAge() >= dog1.getAge() & dog2.getAge() >= dog3.getAge()) {
            System.out.println("The name of the oldest dog is " + dog2.getName() + " and is a " + dog2.getBreed());
        } else {
            System.out.println("The name of the oldest dog is " + dog3.getName() + " and is a " + dog3.getBreed());
        }
    }
}
