package com.softserve.edu06.MyProjects.Homework1;

public class NonFlyingBird extends Bird{

    public NonFlyingBird () {}

    public NonFlyingBird (boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public boolean getFeathers () {
        return super.getFeathers();
    }

    public boolean getLayEggs () {
        return super.getLayEggs();
    }

    public void fly() {
        System.out.println("NonFlyingBird");
    }
}
