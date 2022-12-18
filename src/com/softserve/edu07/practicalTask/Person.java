package com.softserve.edu07.practicalTask;

public abstract class Person {
    private String name;
    private final String TYPE_PERSON = this.getClass().getSimpleName();

    public Person(String name) {
        this.name = name;
        System.out.println(TYPE_PERSON);
    }

    public String getName() {
        return name;
    }

    public abstract void print();
}
