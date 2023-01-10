package com.softserve.edu12.homeWork;

public class OutOfRangeNumberException extends Exception{
    public OutOfRangeNumberException(){
        System.err.println("Число знаходиться поза діапазоном допустимих значень");
    }
    public OutOfRangeNumberException(String msg){
        super(msg);
    }
}
