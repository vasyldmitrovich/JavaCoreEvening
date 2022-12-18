package com.softserve.edu07.practicalTask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        runAnimal();
        runPerson();
    }

    public static void runAnimal() {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.feed();
        dog.voice();
    }

    public static void runPerson() {
        Person person = new Cleaner("Jack");
        Person person1 = new Teacher("Mike");
        Person person2 = new Student("Zheck");
        ArrayList<Person> arr = new ArrayList<>();
        arr.add(person);
        arr.add(person1);
        arr.add(person2);
        for (Person pers : arr) {
            if (pers instanceof Staff) {
                pers.print();
                ((Staff) pers).salary();
            }
            else pers.print();
        }

    }
}
