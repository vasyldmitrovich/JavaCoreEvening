package com.softserve.edu08.Homework;

public abstract class Person {
    FullName fullName;
    int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void info() {
        System.out.println("Person{" +
                "first name: " + fullName.getFirstName() +
                ", last name: " + fullName.getLastName() +
                ", age=" + age +
                '}');
    }
    public abstract String activity();
}
