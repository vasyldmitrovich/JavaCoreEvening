package com.softserve.edu07.PracticalTasks.Person;

public class Student extends Person{
    final public static String TYPE_PERSON = "Peter";

    public Student(String typePerson) {
        super();
    }

    @Override
    public void print() {
        System.out.println("I am a student");
    }
}
