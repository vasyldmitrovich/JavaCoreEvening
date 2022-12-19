package com.softserve.edu04.Homework.One.HttpError;

public enum HTTPError {
    // Done 7 errors because I think it is enough
    BadRequest, Unauthorized, PaymentRequired, Forbidden, NotFound, MethodNotAllowed, NotAcceptable, ProxyAuthenticationRequired;

    public HTTPError meaning(int errorNumber) {
        return switch (errorNumber) {
            case 400 -> BadRequest;
            case 401 -> Unauthorized;
            case 402 -> PaymentRequired;
            case 403 -> Forbidden;
            case 404 -> NotFound;
            case 405 -> MethodNotAllowed;
            case 406 -> NotAcceptable;
            case 407 ->ProxyAuthenticationRequired;
            default -> throw new IllegalStateException("There are acceptable errors between 400 and 407. The error number " + errorNumber + "nor found.");
        };
    }






    }
