package com.softserve.edu06.MyProjects.Homework1;

public class Swallow extends FlyingBird{

    public Swallow() {}

    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("Swallow is FlyingBird. Have feathers: " + super.getFeathers() +
                ". LayEggs: " + super.getLayEggs());
    }
}
