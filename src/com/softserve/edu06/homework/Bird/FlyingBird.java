package com.softserve.edu06.homework.Bird;

public class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    @Override
    void fly() {
        System.out.print("Can fly");
    }
}
