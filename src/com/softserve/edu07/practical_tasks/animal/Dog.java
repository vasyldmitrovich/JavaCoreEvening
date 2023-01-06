package com.softserve.edu07.practical_tasks.animal;

public class Dog implements Animal {
    String name;

    public Dog(String name) {
        this.name = name;
    }
    @Override
    public void voice() {
        System.out.println(this.name + " is barking");
    }

    @Override
    public void feed() {
        System.out.println(this.name +" is eats");

    }
}
