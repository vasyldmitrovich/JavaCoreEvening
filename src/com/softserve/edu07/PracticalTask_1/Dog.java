package com.softserve.edu07.PracticalTask_1;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Gav-gav.");
    }

    @Override
    public void feed() {
        System.out.println("Now dog is eating.");
    }
}
