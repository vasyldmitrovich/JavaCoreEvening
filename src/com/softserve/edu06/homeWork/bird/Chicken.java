package com.softserve.edu06.homeWork.bird;

public class Chicken extends NonFlyingBird{
    private String feathers = "brown";
    private String birdName = "chicken";

    @Override
    public String toString(){
        System.out.println("Вид: " + birdName + ", колір оперення: " + feathers + ", layEggs: " + layEggs);
        return null;
    }
}
