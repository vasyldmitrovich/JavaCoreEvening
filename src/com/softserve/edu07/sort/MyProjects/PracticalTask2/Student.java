package com.softserve.edu07.sort.MyProjects.PracticalTask2;

public class Student extends Person {
    public static final String TYPE_PERSON = "Student";

    private String nameGroup;
    public Student (String name, String nameGroup) {
        super(name);
        this.nameGroup = nameGroup;
        System.out.println("Type of person is: " + TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.println("I am a " + TYPE_PERSON + ". My name is: " + super.getName() +
                ". Group name: " + nameGroup);;
    }
}
