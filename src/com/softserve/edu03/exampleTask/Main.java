package com.softserve.edu03.exampleTask;

public class Main {
    /*Do all in that method like i wrote comment in class Main in package practicalTask*/
    public static void main(String[] args) {
        Student Eugene = new Student("Eugene", 94);
        Student Mark = new Student("Mark", 32);
        Student Alex = new Student("Alex", 100);
        System.out.println("Students average rating " + Student.avgRating());
        System.out.println("Students total rating " + Student.getTotalRating());
    }
}
