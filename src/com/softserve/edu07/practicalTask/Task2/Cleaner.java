package com.softserve.edu07.practicalTask.Task2;

public class Cleaner extends Staff{

    private final String TYPE_PERSON = "cleaner";

    public Cleaner(String name) {
        super(name);
        System.out.println("Creating a " + TYPE_PERSON + " with name " + name);
    }

    @Override
    public void print() {
        System.out.println("I`m a " + TYPE_PERSON);
    }

    @Override
    public void salary() {
        System.out.println("Cleaner salary is 9000");
    }
}
