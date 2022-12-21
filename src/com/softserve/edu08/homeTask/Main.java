package com.softserve.edu08.homeTask;

public class Main {
    public static void main(String[] args) {
        try {
            runPerson();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    static void runPerson() throws CloneNotSupportedException {
        Student student = new Student(new FullName("Jack", "Daniels"), 19, 109);
        Student student1 = new Student(new FullName("Jackyy", "Danielsss"), 21, 110);
        student.info();
        student1.info();
        System.out.println(student.activity());
        Student student3 = (Student) student1.clone();
        student3.setCourseNumber(120);
        student3.info();
    }
}
