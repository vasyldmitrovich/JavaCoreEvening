package com.softserve.edu12.Homework_1;

public class MyArithmeticException extends ArithmeticException{

    private final String errorCode;

    public MyArithmeticException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }
}
