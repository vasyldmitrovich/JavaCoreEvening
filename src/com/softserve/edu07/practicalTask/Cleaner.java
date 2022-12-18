package com.softserve.edu07.practicalTask;


public class Cleaner extends Staff {

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am " + getName());
    }

    @Override
    public void salary() {
        System.out.println("Cleaner has 700 salary");
    }
}
