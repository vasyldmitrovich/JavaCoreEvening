package com.softserve.edu07.sort.MyProjects.PracticalTask2;

public class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";

    public Teacher() {}

    public Teacher(String name, float salary) {
        super(salary);
        super.setName(name);
        System.out.println("Type of person is: " + TYPE_PERSON);
    }

    @Override
    public float salary() {
        return super.getSalary();
    }

    @Override
    void print() {
        System.out.println("I am a " + TYPE_PERSON + ". My name is: " + super.getName());
    }
}
