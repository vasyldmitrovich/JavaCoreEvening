package com.softserve.edu07.PtacticalTasks;

public class Dog implements Animal{
    private String name;

    public Dog(String name) {
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
        return "It can barks";
    }

    @Override
    public String feed() {
        return "It eat meat";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
