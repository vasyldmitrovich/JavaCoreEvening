package com.softserve.edu06.homeTask.Task1;

public class Kiwi extends NonflyingBird{

    public Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.print("Kiwi ");
        super.fly();
    }

    @Override
    public String toString() {
        return "Kiwi{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
