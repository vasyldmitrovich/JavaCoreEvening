package com.softserve.edu10.homeWork.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class AppStudent {
    public static void main(String[] args) {
        LinkedList <Student> students = new LinkedList<>();
        students.add(new Student("Ivanov Ivan", 5));
        students.add(new Student("Petrov Petro", 4));
        students.add(new Student("Mak Olha", 5));
        students.add(new Student("Ivchenko Olha", 3));
        students.add(new Student("Antonov Pavlo", 2));


        Student.printStudent(students);

        Collections.sort(students, new Student.CompareByAge());
        System.out.println("____________\nСписок студентів після сортування за курсом: \n" + students.toString() + "\n");


        Collections.sort(students, new Student.CompareByName());
        System.out.println("____________\nСписок студентів після сортування за ім'ям: \n" + students.toString() + "\n");
    }
}
