package com.softserve.edu03;

public class AppStudent {
    public static void main (String [] args){
        Student student1 = new Student("Dmytro", 9.6f);
        Student student2 = new Student("Mykola", 8.0f);
        Student student3 = new Student();
        System.out.println("Середня оцінка студентів: " + Student.avgRating() +
                ", загальна сума оцінок всіх студентів: " + Student.totalRating());
        student1.betterStudent(student2);
    }
}
