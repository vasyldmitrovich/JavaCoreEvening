package com.softserve.edu06.homeTask;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(boolean feathers, boolean isFlying) {
        super(feathers, isFlying);
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " isn't flying");
    }
}
