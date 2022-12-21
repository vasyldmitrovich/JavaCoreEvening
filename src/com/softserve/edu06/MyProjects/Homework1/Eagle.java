package com.softserve.edu06.MyProjects.Homework1;

public class Eagle extends FlyingBird{

    public Eagle() {}

    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("Eagle is FlyingBird. Have feathers: " + super.getFeathers() +
        ". LayEggs: " + super.getLayEggs());
    }
}
