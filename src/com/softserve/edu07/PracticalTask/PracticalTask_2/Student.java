package com.softserve.edu07.PracticalTask.PracticalTask_2;

public class Student extends Person{

    private final String TYPE_PERSON;

    protected Student(String name) {
        super(name);
        TYPE_PERSON = getClass().getSimpleName();
        System.out.println("This is a " + TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.println("I am a " + getClass().getSimpleName());
    }
}
