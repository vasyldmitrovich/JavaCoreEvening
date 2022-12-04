package com.softserve.edu03;

public class Student {

    private String name;
    private double rating;
    private static double TotalRating;
    private static int studCount;

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        studCount++;
        TotalRating += rating;
    }

    public String getname(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public static double getTotalRating() {
        return TotalRating;
    }


    public static double avgRating() {
        return TotalRating / studCount;
    }

    public boolean betterStudent(Student s){
        return this.rating > s.rating;
    }

    @Override
    public String toString() {
        return "Student{" + "Name='" + name + ", rating=" + rating + "}";
    }

}

