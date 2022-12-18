package com.softserve.edu07.practicalTask;

public class Cat implements Animal{
    public Cat() {
    }

    @Override
    public void voice() {
        System.out.println("Cat is meowing");
    }

    @Override
    public void feed() {
        System.out.println("Cat is eating");
    }
}
