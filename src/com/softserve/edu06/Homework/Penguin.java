package com.softserve.edu06.Homework;

public class Penguin extends NonFlyingBird{

    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
