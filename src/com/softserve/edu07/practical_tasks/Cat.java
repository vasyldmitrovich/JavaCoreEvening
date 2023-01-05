package com.softserve.edu07.practical_tasks;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("cat meowing");
    }

    @Override
    public void feed() {
        System.out.println("cat eats");

    }
}
