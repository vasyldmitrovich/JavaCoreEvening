package com.softserve.edu06.HomeTasks;

public class Swallow extends FlyingBird{
    private String name;

    public Swallow(String name) {
        super(true, true, false);
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nSwallow{" +
                "name='" + name + '\'' +
                ", predatory=" + predatory +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }

    @Override
    public void fly() {
        System.out.print("It is swallow. ");
        super.fly();
    }
}
