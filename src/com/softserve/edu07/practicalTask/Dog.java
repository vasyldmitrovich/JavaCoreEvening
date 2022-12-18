package com.softserve.edu07.practicalTask;

public class Dog implements Animal {
    public Dog() {
    }

    @Override
    public void voice() {
        System.out.println("Dog is barking");
    }

    @Override
    public void feed() {
        System.out.println("Dog is eating");
    }
}
