package com.softserve.edu10.StudentTask;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void go(){
       List<Student> students = createListStudents();

       printStudents(students, "Original list:");

       students.sort(new Student.NameComparator());
       printStudents(students, "List sorted by name:");

       students.sort(new Student.CourseComparator());
       printStudents(students, "List sorted by course:");

       int course = 3;
       System.out.println("\nStudents which taught on "+course+" course");
       Student.printStudents(students,course);
    }

    public static List<Student> createListStudents(){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Olga", 1));
        students.add(new Student("Roman", 1));
        students.add(new Student("Maria", 3));
        students.add(new Student("Nikita", 2));
        students.add(new Student("Katerina", 3));

        return students;
    }

    public static void printStudents(List<Student> students, String title){
        System.out.println("\n"+title);
        System.out.println(students);
    }
}
