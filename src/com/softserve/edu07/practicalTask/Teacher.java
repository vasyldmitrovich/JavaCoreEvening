package com.softserve.edu07.practicalTask;

public class Teacher extends Staff {

    public Teacher(String name) {
        super(name);
        System.out.println();
    }

    @Override
    public void print() {
        System.out.println("I am " + getName());
    }

    @Override
    public void salary() {
        System.out.println("Teacher has 1000 salary");
    }
}
