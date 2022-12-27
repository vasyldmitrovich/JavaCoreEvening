package com.softserve.edu06.HomeTasks.Birds;

import com.softserve.edu06.HomeTasks.Birds.NonFlyingBird;

public class Penguin extends NonFlyingBird {
    private String name;

    public Penguin(String name) {
        super(false, true, true);
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nPenguin{" +
                "name='" + name + '\'' +
                ", canSwimming=" + canSwimming +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }

    @Override
    public void fly() {
        System.out.print("It is penguin. ");
        super.fly();
    }
}
