package com.softserve.edu06.Homework;

public class FlyingBird extends Bird{

    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public boolean fly() {
        System.out.println(getClass().getSimpleName() + " can fly!");
        return false;


    }
}
