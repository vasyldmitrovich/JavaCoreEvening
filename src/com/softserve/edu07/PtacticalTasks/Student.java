package com.softserve.edu07.PtacticalTasks;

public class Student extends Person{
    final String TYPE_PERSON = "student";

    public Student(String name) {
        setName(name);
    }

    @Override
    void print() {
        System.out.println("Name: "+this.getName()+" .Type is "+TYPE_PERSON+".");
    }
}
