package com.softserve.edu12.Homework.Homework_2;

public class MyException extends Exception{

    private final String errorCode;

    public MyException(String message, String errorCode) {
        super(message);
        this.errorCode=errorCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }
}
