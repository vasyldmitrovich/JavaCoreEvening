package com.softserve.edu07.PracticalTask.PracticalTask_2;

public abstract class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    abstract void print();
}
