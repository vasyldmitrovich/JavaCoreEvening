package com.softserve.edu07.sort.MyProjects.PracticalTask1;

public class Dog implements Animal{

    public Dog() {

    }
    @Override
    public void voice() {
        System.out.println("Gav...");
    }

    @Override
    public void feed() {
        System.out.println("Dog is eating...");
    }
}
