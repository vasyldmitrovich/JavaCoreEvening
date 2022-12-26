package com.softserve.edu06.homework.Bird;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    @Override
    void fly() {
        System.out.print("Can not Fly");

    }
}
