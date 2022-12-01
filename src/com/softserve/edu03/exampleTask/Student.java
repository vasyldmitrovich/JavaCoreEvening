package com.softserve.edu03.exampleTask;

public class Student {

    private String name;

    private double rating;

    private static double totalRating;

    private static int studentsCount;

    public Student(String name, double rating){
        this.name = name;
        this.rating = rating;
        totalRating += rating;
        studentsCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public static double getTotalRating() {
        return totalRating;
    }


    public static double avgRating(){
        return totalRating/studentsCount;
    }

    public boolean betterStudent(Student s){
        return this.rating > s.rating;
    }

    @Override
    public String toString() {
        return this.name + " rating: " + this.rating;
    }
}
