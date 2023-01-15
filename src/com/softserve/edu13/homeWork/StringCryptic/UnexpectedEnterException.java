package com.softserve.edu13.homeWork.StringCryptic;

public class UnexpectedEnterException extends Exception{
    public UnexpectedEnterException(){
        System.err.println("Рядок має містити лише літери");
    }
}
