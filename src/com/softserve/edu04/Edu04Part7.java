package com.softserve.edu04;

/**
 * HOMEWORK
 * Сreate class Dog with fields name, breed, age
 * • Declare enum for field breed
 * • Create 3 instances of type Dog
 * • Check if there is no two dogs with the same name
 * • Display the name and the kind of the oldest dog
 */
public class Edu04Part7 {
    public static void main(String[] args) {
        int oldestAge = 0;
        Dog oldestDog = null;

        Dog labrador = new Dog("MAX", 7, BreedDogs.LABRADOR);
        Dog doberman = new Dog("ROMEO", 4, BreedDogs.DOBERMAN);
        Dog newfoundland = new Dog("TOBY", 2, BreedDogs.NEWFOUNDLAND);


        if (labrador.getName().equals(doberman.getName()))
            System.out.println("the names of the first and second dogs are the same");

        if (labrador.getName().equals(newfoundland.getName()))
            System.out.println("the names of the first and third dogs are the same");

        if (doberman.getName().equals(newfoundland.getName()))
            System.out.println("the names of the second and third dogs are the same");

        if (labrador.getAge() > oldestAge) {
            oldestAge = labrador.getAge();
            oldestDog = labrador;
        }
        if (doberman.getAge() > oldestAge) {
            oldestAge = doberman.getAge();
            oldestDog = doberman;
        }
        if (newfoundland.getAge() > oldestAge) {
            oldestAge = newfoundland.getAge();
            oldestDog = newfoundland;
        }
        System.out.println("The oldest dog is " + oldestDog.getName() + " " + oldestDog.getBreedDogs());
    }
}

class Dog {
    String name;
    int age;

    BreedDogs breedDogs;

    public String getName() {
        return name;
    }

    public BreedDogs getBreedDogs() {
        return breedDogs;
    }

    public int getAge() {
        return age;
    }

    public Dog(String name, int age, BreedDogs breedDogs) {
        this.name = name;
        this.age = age;
        this.breedDogs = breedDogs;
    }
}

enum BreedDogs {
    LABRADOR, SHEPHERD, POODLE, DACHSHUND, CHIHUAHUA, DOBERMAN, NEWFOUNDLAND
}