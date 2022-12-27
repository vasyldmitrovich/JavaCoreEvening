package com.softserve.edu06.HomeTasks.Birds;

import com.softserve.edu06.HomeTasks.Birds.Bird;

public class NonFlyingBird extends Bird {
    protected boolean canSwimming;

    public void fly(){
        System.out.println("It can't fly.");
    }

    public NonFlyingBird(boolean feathers, boolean layEggs, boolean canSwimming) {
        this.feathers = feathers;
        this.canSwimming = canSwimming;
        this.layEggs = layEggs;
    }
}
