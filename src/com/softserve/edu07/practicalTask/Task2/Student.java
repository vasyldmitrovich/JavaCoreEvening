package com.softserve.edu07.practicalTask.Task2;

public class Student extends Person{

    private final static String TYPE_PERSON = "student";

    public Student(String name) {
        super(name);
        System.out.println("Creating a " + TYPE_PERSON + " with name " + name);
    }

    @Override
    public void print() {
        System.out.println("I`m a " + TYPE_PERSON);
    }
}
