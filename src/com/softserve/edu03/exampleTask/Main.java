package com.softserve.edu03.exampleTask;

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start(){
        Student student1 = new Student("Vladyslav", 10.2);
        Student student2 = new Student("Oleh", 8.5);
        Student student3 = new Student("Andriy", 15.3);

        getInfoAboutStudents(new Student[]{student1,student2,student3});


        System.out.println("Average rating: " + Student.avgRating());
        System.out.println("Total rating: " + Student.getTotalRating());

        System.out.println("Is " + student1.getName() + " better than " + student2.getName() + " ? " + student1.betterStudent(student2));
    }

    public static void getInfoAboutStudents(Student ...students){
        for (Student s: students){
            System.out.println(s);
        }
    }
}
