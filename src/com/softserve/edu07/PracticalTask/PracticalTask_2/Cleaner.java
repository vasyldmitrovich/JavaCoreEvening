package com.softserve.edu07.PracticalTask.PracticalTask_2;

public class Cleaner extends Staff{

    private final int salary;

    private final String TYPE_PERSON;


    protected Cleaner(String name, int salary) {
        super(name);
        this.salary = salary;
        TYPE_PERSON = getClass().getSimpleName();
        System.out.println("This is a " + TYPE_PERSON);
    }

    @Override
    void salary() {
        System.out.println(getClass().getSimpleName() + " salary is " + salary + '.');
    }

    @Override
    void print() {
        super.print();
    }
}
