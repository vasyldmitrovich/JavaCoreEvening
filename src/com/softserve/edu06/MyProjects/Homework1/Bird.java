package com.softserve.edu06.MyProjects.Homework1;

abstract public class Bird {
    private String feathers;
    private boolean layEggs;

    public Bird () {}

    abstract public void fly();

    @Override
    public String toString() {
        return "feathers= " + feathers + "Can layEggs= " + layEggs;
    }
}
