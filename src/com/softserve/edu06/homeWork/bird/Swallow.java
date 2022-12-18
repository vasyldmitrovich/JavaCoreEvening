package com.softserve.edu06.homeWork.bird;

public class Swallow extends FlyingBird{
    private String feathers = "black and white";
    private String birdName = "swallow";

    @Override
    public String toString(){
        System.out.println("Вид: " + birdName + ", колір оперення: " + feathers + ", layEggs: " + layEggs);
        return null;
    }
}
