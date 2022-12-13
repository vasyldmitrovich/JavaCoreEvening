package com.softserve.edu06.homeTask.Task1;

public class FlyingBird extends Bird{


    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
