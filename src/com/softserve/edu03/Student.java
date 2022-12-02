package com.softserve.edu03;

public class Student {
    private String name;
    private int rating;
    private static int counter;
    private static int totalRating;
    private static double avgRating;

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        counter++;
        totalRating += rating;
        avgRating = totalRating / counter;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public static double getAvgRating() {
        return avgRating;
    }
    public static int getTotalRating() {
        return totalRating;
    }
    public boolean betterStudent (Student s) {
        return rating > s.rating;
    }

    @Override
    public String toString() {
        return "Students name = " + name + ", rating = " + rating;
    }
}
