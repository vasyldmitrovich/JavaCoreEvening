package com.softserve.edu06.Homework;

public class NonFlyingBird extends Bird{

    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public boolean fly() {
        System.out.println(getClass().getSimpleName() + " cant fly.");
        return false;
    }
}
