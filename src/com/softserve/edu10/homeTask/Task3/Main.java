package com.softserve.edu10.homeTask.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        List<Student> students = createStudents();
        System.out.println(students);
        Student.printStudents(students,1);

        //default sort (by courses)
        Collections.sort(students);
        System.out.println(students);
        //sorting with comparator
        Collections.sort(students,Student.compareByNames());
        System.out.println(students);
    }

    public static List<Student> createStudents(){
        List<Student> tempList = new ArrayList<>();
        tempList.add(new Student("Vlad", 3));
        tempList.add(new Student("Oleg", 2));
        tempList.add(new Student("Nazar", 1));
        tempList.add(new Student("Andriy", 2));
        tempList.add(new Student("Olexiy", 1));
        tempList.add(new Student("Sergiy", 4));
        tempList.add(new Student("Borys", 4));
        return tempList;
    }
}
