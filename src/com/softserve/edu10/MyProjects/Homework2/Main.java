package com.softserve.edu10.MyProjects.Homework2;

/*Roman Sitko
* Lesson 10, Homework 2
* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Roman Fildo", 12));
        list.add(new Student("Anna-Maria Jonson", 12));
        list.add(new Student("Asad Miart", 11));
        list.add(new Student("Muhamed Ali", 11));
        list.add(new Student("Solomia Krushelnycka", 11));


        Student student = new Student();
        student.printStudents(list, 11);

        System.out.println("Sort by name:");
        Collections.sort(list, new Student.ByName());
        System.out.println(list);

        System.out.println("Sort by course:");
        Collections.sort(list, new Student.ByCourse());
        System.out.println(list);
    }
}
