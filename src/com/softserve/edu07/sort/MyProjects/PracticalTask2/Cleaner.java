package com.softserve.edu07.sort.MyProjects.PracticalTask2;

public class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner() {}

    public Cleaner(String name, float salary) {
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
