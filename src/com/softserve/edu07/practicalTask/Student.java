package com.softserve.edu07.practicalTask;

public class Student extends Person{

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am " + getName());
    }
}
