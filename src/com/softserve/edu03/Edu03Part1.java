package com.softserve.edu03;

/**
 * EXAMPLE
 */
public class Edu03Part1 {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", 41);
        Student student2 = new Student("Max", 74);
        Student student3 = new Student("Tom", 52);


        System.out.println("Total rating: " + Student.totalRating);
        System.out.println("Average rating: " + Student.avgRating());
        System.out.println("Student 1 better than Student 2: " + Student.betterStudent(student1, student2));

    }
}

class Student {
    private String name;
    private int rating;

    static int totalRating; //total rating of all student.
    static int countStudents; //number of students

    public void setName(String name) {
        this.name = name;
        countStudents++;
    }

    public String getName() {
        return name;
    }

    public void setRating(int rating) {
        this.rating = rating;
        totalRating += rating;
    }

    public int getRating() {
        return rating;
    }

    public Student() {//default constructor
    }

    public Student(String name, int rating) {//Constructor with parameters
        this.name = name;
        this.rating = rating;
        countStudents++;
        totalRating += rating;
    }

    static int avgRating() {//average rating of all student.
        return Student.totalRating / Student.countStudents;
    }

    public static boolean betterStudent(Student s1, Student s2) {
        if (s1.getRating() > s2.getRating()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return name + " " + rating;
    }
}
