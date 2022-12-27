package com.softserve.edu07.PtacticalTasks.Persons;

public class Student extends Person {
    final String TYPE_PERSON = "student";

    public Student(String name) {
        setName(name);
    }

    @Override
    public void print() {
        System.out.println("Name: "+this.getName()+". Type is "+TYPE_PERSON+".");
    }
}
