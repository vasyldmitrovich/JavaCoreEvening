package com.softserve.edu03.Example;

public class Student {
    private String name;
    private double rating;
    private static double ratingSum;
    private static int count;

    public Student() {
        this.name = "";
        this.rating = 0;
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        ratingSum += rating;
        count++;
    }
    public static double avgRating() {
        return ratingSum / count;
    }

    public boolean betterStudent(Student s) {
        return this.rating > s.rating;
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

    public static double getRatingSum() {
        return ratingSum;
    }

    public static void setRatingSum(double ratingSum) {
        Student.ratingSum = ratingSum;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }


}
