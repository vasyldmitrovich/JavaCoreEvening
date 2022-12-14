package com.softserve.edu06.homeTask;

public class FlyingBird extends Bird {

    public FlyingBird(boolean feathers, boolean isFlying){
        super(feathers, isFlying);
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying");
    }
}
