package com.softserve.edu06.homeWork.bird;

public class Eagle extends FlyingBird{
   private String feathers = "brown";
   private String birdName = "eagle";

   @Override
   public String toString(){
      System.out.println("Вид: " + birdName + ", колір оперення: " + feathers + ", layEggs: " + layEggs);
      return null;
   }

}
