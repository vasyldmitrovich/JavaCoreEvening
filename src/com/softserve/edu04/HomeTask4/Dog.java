package com.softserve.edu04.HomeTask4;

import java.util.Objects;

public class Dog {
    private String name;
    private Breed breed;
    int age;


    public Dog(){
        name = "";
        age = 0;
    }

    public Dog(String name, Breed breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public  boolean equalsName(Dog dog){
        return Objects.equals(this.name, dog.name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name) && breed == dog.breed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }
}
