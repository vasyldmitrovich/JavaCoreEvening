package com.softserve.edu06.homework.Bird;

public abstract class Bird {
    protected boolean feathers;
    protected boolean layEggs;


    abstract void fly();

    @Override
    public String toString() {
        return ", bird " + this.getClass().getSimpleName() + ", feathers=" + feathers + ", layEggs=" + layEggs;
    }
}
