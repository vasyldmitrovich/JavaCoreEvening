package com.softserve.edu07.practical_tasks;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("dog barking");
    }

    @Override
    public void feed() {
        System.out.println("dog eats");

    }
}
