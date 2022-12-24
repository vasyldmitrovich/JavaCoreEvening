package com.softserve.edu08.HomeTask;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        run();
    }

    public static void run() throws CloneNotSupportedException {
        /*If you work only with Student that means you not needed abstract class Person*/
        Student student1 = new Student(new FullName("Din", "Rid"), 25, 5);
        Student student2 = new Student(new FullName("Ben", "Gun"), 23, 4);
        Student student3 = (Student) student1.clone();

        student1.setCourse(2);

        Student[] arr = {student1, student2, student3};
        for (Student students: arr) {
            System.out.println(students.info());
            System.out.println(students.activity());
            System.out.println();
        }
    }
}
