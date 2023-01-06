package com.softserve.edu07.practical_tasks.person;

public class Student extends Person {
    final String TYPE_PERSON;

    public Student(String name) {
        this.name = name;
        this.TYPE_PERSON = this.getClass().getSimpleName();
    }

    @Override
    void print() {
        System.out.println("My name is " + this.name + ", and I am a " + TYPE_PERSON);

    }
}
