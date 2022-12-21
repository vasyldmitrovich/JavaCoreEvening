package com.softserve.edu06.MyProjects.Homework1;

public class Penguin extends NonFlyingBird{

    public Penguin() {}

    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("Penguin is NonFlyingBird. Have feathers: " + super.getFeathers() +
                ". LayEggs: " + super.getLayEggs());
    }

}
