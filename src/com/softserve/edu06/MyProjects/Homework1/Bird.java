package com.softserve.edu06.MyProjects.Homework1;

abstract public class Bird {
    private boolean feathers;
    private boolean layEggs;

    public Bird () {}

    public Bird (boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public boolean getFeathers () {
        return feathers;
    }

    public boolean getLayEggs () {
        return layEggs;
    }

    abstract public void fly();

    @Override
    public String toString() {
        return "feathers= " + feathers + "Can layEggs= " + layEggs;
    }
}
