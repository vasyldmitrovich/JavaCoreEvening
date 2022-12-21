package com.softserve.edu03.exampleTask;

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start(){

        Student[] students = createStudents();
        getInfoAboutStudents(students);


        System.out.println("Average rating: " + Student.avgRating());
        System.out.println("Total rating: " + Student.getTotalRating());
        System.out.println("Is " + students[0].getName() + " better than " + students[1].getName() + " ? " + students[0].betterStudent(students[1]));
    }

    public static Student[] createStudents(){
        Student student1 = new Student("Vladyslav", 10.2);
        Student student2 = new Student("Oleh", 8.5);
        Student student3 = new Student("Andriy", 15.3);

        return new Student[]{student1,student2,student3};
    }

    public static void getInfoAboutStudents(Student ...students){
        for (Student s: students){
            System.out.println(s);
        }
    }
}
