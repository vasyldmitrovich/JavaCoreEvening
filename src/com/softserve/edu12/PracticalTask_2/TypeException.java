package com.softserve.edu12.PracticalTask_2;

public class TypeException extends Exception {

    private final String errorCode;

    public TypeException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }
}
