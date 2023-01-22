package com.softserve.edu10.Homework.Homework_3;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Nazar", 6));
        students.add(new Student("Oleg", 3));
        students.add(new Student("Dima", 2));
        students.add(new Student("Igor", 6));
        students.add(new Student("Olia", 3));
        students.add(new Student("Inna", 6));
        students.add(new Student("Inna", 6));
        System.out.println("List of students: \n" + students);
        System.out.println();

        new Student().printStudents(students, 6);
        System.out.println();

        students.sort(new Student.ByCourse());
        System.out.println("Sorted by course: \n" + students);

        students.sort(new Student.ByName());
        System.out.println("Sorted by name: \n" + students);

    }
}
