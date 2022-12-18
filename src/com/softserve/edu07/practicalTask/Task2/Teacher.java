package com.softserve.edu07.practicalTask.Task2;

public class Teacher extends Staff{

    private final String TYPE_PERSON = "teacher";

    public Teacher(String name) {
        super(name);
        System.out.println("Creating a " + TYPE_PERSON + " with name " + name);
    }

    @Override
    public void print() {
        System.out.println("I`m a " + TYPE_PERSON);
    }

    @Override
    public void salary() {
        System.out.println("Teacher salary is 12000");
    }
}
