package com.softserve.edu06.HomeTasks;

public class FlyingBird extends Bird{
    protected boolean predatory;
    public void fly(){
        System.out.println("It can fly.");
    }

    public FlyingBird(boolean feathers, boolean layEggs, boolean predatory) {
        super.feathers = feathers;
        this.predatory = predatory;
        this.layEggs = layEggs;
    }
}
