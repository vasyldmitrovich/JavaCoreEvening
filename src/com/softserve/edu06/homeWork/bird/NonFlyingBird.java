package com.softserve.edu06.homeWork.bird;

public class NonFlyingBird extends Birds{

    @Override
    public void fly(){
        System.out.println("Даний вид не може літати");
    }
}
