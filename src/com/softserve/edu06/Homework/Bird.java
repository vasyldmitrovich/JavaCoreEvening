package com.softserve.edu06.Homework;

public abstract class Bird {
boolean feathers;
boolean layEggs;

public abstract boolean fly();

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }


    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
