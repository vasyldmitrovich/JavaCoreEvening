package com.softserve.edu06.MyProjects.Homework1;

public class Chicken extends NonFlyingBird{

    public Chicken() {}

    public Chicken(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("Chicken is NonFlyingBird. Have feathers: " + super.getFeathers() +
                ". LayEggs: " + super.getLayEggs());
    }
}
