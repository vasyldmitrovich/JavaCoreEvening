package com.softserve.edu06.homeWork.bird;

public class Penguin extends NonFlyingBird{
    private String feathers = "black and white";
    private String birdName = "penguin";

    @Override
    public String toString(){
        System.out.println("Вид: " + birdName + ", колір оперення: " + feathers + ", layEggs: " + layEggs);
        return null;
    }
}
