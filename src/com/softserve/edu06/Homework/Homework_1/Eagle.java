package com.softserve.edu06.Homework.Homework_1;

public class Eagle extends FlyingBird{

    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Eagle can fly.");
    }
}
