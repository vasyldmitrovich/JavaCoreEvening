package com.softserve.edu12.PracticalTask.PracticalTask_2;

public class ColorException extends Exception {

    private final String errorCode;

    public ColorException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }
}
