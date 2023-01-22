package com.softserve.edu04.PracticalTask.p3;


public enum Continent {


   Europe("Germany", "Belgium", "Poland", "Ukraine"),
    Asia("China", "Japan", "Korea", "India"),
    Africa("Ethiopia", "Kenia", "Egypt", "Morocco"),
    Australia("Australia","New Zealand","Fiji","Solomon Islands"),
    America("Canada", "Brasil", "Cuba", "Colombia");
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    Continent (String a, String b, String c, String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }



}



