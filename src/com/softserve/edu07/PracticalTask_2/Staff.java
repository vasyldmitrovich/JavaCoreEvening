package com.softserve.edu07.PracticalTask_2;

public abstract class Staff extends Person{


    public Staff(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("I am a " + getClass().getSimpleName());
    }

    abstract void salary();
}
