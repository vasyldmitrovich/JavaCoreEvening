package com.softserve.edu08.homeTask;

public abstract class Person implements Cloneable {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void info() {
        System.out.printf("First name: %s, Last name: %s, Age: %d", fullName.getFirstName(), fullName.getLastName(), age);
    }
    public abstract String activity();


}