package com.softserve.edu06.MyProjects.Homework1;

public class FlyingBird extends Bird{

    public FlyingBird () {}

    public FlyingBird (boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public boolean getFeathers () {
        return super.getFeathers();
    }

    public boolean getLayEggs () {
        return super.getLayEggs();
    }

    public void fly() {
        System.out.println("FlyingBird");
    }
}
