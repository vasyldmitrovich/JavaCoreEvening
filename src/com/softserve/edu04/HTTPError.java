package com.softserve.edu04;

public enum HTTPError {
        BAD_REQUEST(400),UNAUTHORIZED(401),PAYMENT_REQUIRED(402),
        FORBIDDEN(403),NOT_FOUND(404);

   private final int numberError;


    HTTPError(int numberError) {
        this.numberError = numberError;
    }

    public int getNumberError() {
        return numberError;
    }

}
