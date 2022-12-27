package com.softserve.edu07.PtacticalTasks.Animals;

import com.softserve.edu07.PtacticalTasks.Animals.Animal;

public class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String voice() {
        return "It can meow.";
    }

    @Override
    public String feed() {
        return "It eat mice.";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
