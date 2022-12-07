package com.softserve.edu04.Homework.Task1;

public enum HTTPError {
FOUR_ZERO_ZERO("Bad Request"),
    FOUR_ZERO_ONE("Unauthorized"),
    FOUR_ZERO_THREE("Forbidden"),
    FOUR_ZERO_FOUR("Not Found"),
    FIVE_ZERO_ZERO("Internal Server Error"),
    FIVE_ZERO_TWO("Bad Gateway"),
    FIVE_ZERO_THREE("Service Unavailable"),
    FIVE_ZERO_FOUR("Gateway Timeout");

    private final String error;

    HTTPError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
