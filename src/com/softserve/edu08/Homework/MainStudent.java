package com.softserve.edu08.Homework;

public class MainStudent {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(new FullName("Petrov", "Ivan"), 18, 2);
        Student s2 = new Student(new FullName("Korol", "Olga"), 19, 3);

        s1.info();
        System.out.println(s1.activity());
        s2.info();
        System.out.println(s2.activity());
        Student s3 = (Student) s1.clone();
        s3.info();
        s3.setCourse(4);
        s3.info();
    }
}
