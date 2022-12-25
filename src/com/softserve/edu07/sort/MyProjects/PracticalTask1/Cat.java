package com.softserve.edu07.sort.MyProjects.PracticalTask1;

public class Cat implements Animal{

    public Cat() {

    }
    @Override
    public void voice() {
        System.out.println("Meow...");
    }

    @Override
    public void feed() {
        System.out.println("Cat is eating...");
    }
}
