package com.softserve.edu03;

public class StudentMain {
    public static void main (String []args) {
        Student St1 = new Student("Ihor", 98);
        Student St2 = new Student("Pavlo", 86);
        Student St3 = new Student("Semen", 102);
        St3.setName("Ivan");
        St3.setRating(63);
        System.out.println(St1.getName() + " has rating " + St1.getRating());
        System.out.println(St2.getName() + " has rating " + St2.getRating());
        System.out.println(St3.getName() + " has rating " + St3.getRating());

        System.out.println("Average rating= " + Student.getAvgRating());
        System.out.println("Total rating= " + Student.getTotalRating());

        System.out.println(St2.getName() + " is better than " + St3.getName() + " " + "= " + St2.betterStudent(St3));
    }
}
