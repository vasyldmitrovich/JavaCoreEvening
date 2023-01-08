package com.softserve.edu06.Homework_1;

public class NotFlyingBird extends Bird{

    public NotFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This bird can't fly");
    }
}
