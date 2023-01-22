package com.softserve.edu12.PracticalTask_1;

public class MyException extends Exception {

    private final String errorCode;

    public MyException(String message, String errorCode) {
        super(message);
        this.errorCode=errorCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }
}