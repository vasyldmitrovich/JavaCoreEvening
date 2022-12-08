package com.softserve.edu04.HomeTask4;

public enum HttpErrors {

    BAD_REQUEST("Bad Request"), UNAUTHORIZED("Unauthorized"), PAYMENT_REQUIRED("Payment Required"),
    FORBIDDEN("Forbidden"), NOT_FOUND("Not Found"), METHOD_NOT_ALOWED("Method Not Allowed"),
    NOT_ACCEPTABLE("Not Acceptable"), PROXY_AUTHENTICATION_REQUIRED("Proxy Authentication Required"),
    REQUEST_TIMEOUT("Request Timeout"), CONFLICT("Conflict"), GONE("Gone"), LENGTH_REQUIRED("Length Required"),
    PRECONDITION_FAILED("Precondition Failed"), REQUEST_ENTITY_TOO_LARGE("Request Entity Too Large"),
    REQUEST_URI_TOO_LONG("Request-URI Too Long"), UNSUPPORTED_MEDIA_TYPE("Unsupported Media Type"),
    REQUEST_RANGE_NOT_SATISFIABLE("Requested Range Not Satisfiable"), EXPECTION_FAILED("Expectation Failed");
    private final String name;

    HttpErrors(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
