package com.softserve.edu03.exampleTask;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vladyslav", 10.2);
        Student student2 = new Student("Oleh", 8.5);
        Student student3 = new Student("Andriy", 15.3);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("Average rating: " + Student.avgRating());
        System.out.println("Total rating: " + Student.getTotalRating());

        System.out.println("Is " + student1.getName() + " better than " + student2.getName() + " ? " + student1.betterStudent(student2));
    }
}
