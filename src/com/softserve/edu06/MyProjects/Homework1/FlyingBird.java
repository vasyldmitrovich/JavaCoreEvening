package com.softserve.edu06.MyProjects.Homework1;

public class FlyingBird extends Bird{

    public FlyingBird (boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("FlyingBird");
    }
}
