package com.softserve.edu06.HomeTasks;

public class Eagle extends FlyingBird{
   private String name;

    public Eagle(String name) {
        super(true, true,true);
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nEagle{" +
                "name='" + name + '\'' +
                ", predatory=" + predatory +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }

    @Override
    public void fly() {
        System.out.print("It is eagle. ");
        super.fly();
    }
}
