package com.softserve.edu03.exampleTask;

public class Student {
    private String name;
    private double rating;
    private static int count;
    private static double totalRating;


    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        count++;
        totalRating += rating;
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

    public void setRating(double rating) {
        this.rating = rating;
    }

    public static double getTotalRating() {
        return totalRating;
    }

    public static double avgRating() {
        return totalRating / count;
    }


    public boolean betterStudent(Student student) {
        return this.rating > student.rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
