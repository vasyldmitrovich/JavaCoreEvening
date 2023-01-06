package com.softserve.edu07.practical_tasks.animal;

public class Cat implements Animal {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(this.name + " is meowing");
    }

    @Override
    public void feed() {
        System.out.println(this.name +" is eats");

    }
}
