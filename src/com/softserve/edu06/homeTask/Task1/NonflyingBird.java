package com.softserve.edu06.homeTask.Task1;

public class NonflyingBird extends Bird{

    public NonflyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can`t fly");
    }

    @Override
    public String toString() {
        return "NonflyingBird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
