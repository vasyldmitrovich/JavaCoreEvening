package com.softserve.edu07.practicalTask.Task1;

public class Cat implements Animal{

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void voice() {
        System.out.println("Cat " + this.name + " is meowing");
    }

    @Override
    public void feed() {
        System.out.println("Cat " + this.name + " is eating");
    }
}
