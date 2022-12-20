package com.softserve.edu07.PracticalTasks.Person;

public abstract class Staff extends Person{
    public Staff() {
        super();
    }

    @Override
    public void print() {
        System.out.println("I am a staff");
    }

    public abstract void salary();
}
