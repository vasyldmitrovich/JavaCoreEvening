package com.softserve.edu04.Homework;

import java.util.Objects;

public class Dog {
    public enum Breed {
        golden_retriever,
        labrador_retriever,
        french_bulldog,
        beagle,
        german_dog,
        poodle,
        bulldog
    }
private final Breed dBreed;
    private String name;
    private int age;
    public static int OldestAge = 0;

    public Dog(Breed dBreed, String name, int age) {
        this.dBreed = dBreed;
        this.name = name;
        this.age = age;

    if (OldestAge < age) {
            OldestAge = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getOldestAge() {
        return OldestAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        return name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed=" + dBreed +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

