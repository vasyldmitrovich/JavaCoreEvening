package com.softserve.edu03;

public class AppStudent {
    /*Make in that class some method like
        public static run()
        and in that method create all that objects
        after that print information
        in method main call that method run()
        And you must have two another method for read information from user
        and print information
        In main method you call that another methods*/
    public static void main (String [] args){
        Student student1 = new Student("Dmytro", 9.6f);
        Student student2 = new Student("Mykola", 8.0f);
        Student student3 = new Student();
        System.out.println("Середня оцінка студентів: " + Student.avgRating() +
                ", загальна сума оцінок всіх студентів: " + Student.totalRating());
        student1.betterStudent(student2);
    }
}
