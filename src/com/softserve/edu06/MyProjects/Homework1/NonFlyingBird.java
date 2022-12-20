package com.softserve.edu06.MyProjects.Homework1;

public class NonFlyingBird extends Bird{

    public NonFlyingBird (boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("NonFlyingBird");
    }
}
