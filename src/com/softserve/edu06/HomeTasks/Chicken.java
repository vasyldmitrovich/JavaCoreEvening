package com.softserve.edu06.HomeTasks;

public class Chicken extends NonFlyingBird{
    private String name;

    public Chicken(String name) {
        super(true, false, false);
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nChicken{" +
                "name='" + name + '\'' +
                ", canSwimming=" + canSwimming +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }

    @Override
    public void fly() {
        System.out.print("It is chicken. ");
        super.fly();
    }
}
