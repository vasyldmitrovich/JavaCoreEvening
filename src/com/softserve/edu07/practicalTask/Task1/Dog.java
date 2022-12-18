package com.softserve.edu07.practicalTask.Task1;

public class Dog implements Animal{

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void voice() {
        System.out.println("Dog " + this.name + " is barking");
    }

    @Override
    public void feed() {
        System.out.println("Dog" + this.name + "is eating");
    }
}
