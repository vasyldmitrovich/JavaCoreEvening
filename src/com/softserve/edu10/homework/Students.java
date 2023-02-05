package com.softserve.edu10.homework;

import java.util.*;

public class Students {
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student("John", 1));
        listStudent.add(new Student("Willie", 1));
        listStudent.add(new Student("Sara", 2));
        listStudent.add(new Student("Mark", 3));
        listStudent.add(new Student("Alex", 4));
        listStudent.add(new Student("Adam", 1));

        System.out.println(Student.printStudents(listStudent, 1));

        Student.compareToName(listStudent);
        System.out.println("Sorted by name---> " + listStudent);

        Student.compareToCourse(listStudent);
        System.out.println("Sorted by course-> " + listStudent);

    }
}

class Student {
    private String name;
    private final int course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [" + "name='" + name + '\'' + ", course=" + course + "]";
    }

    public static List<String> printStudents(List<Student> students, Integer numCourse) {
        List<String> studentOfCourse = new ArrayList<>();
        for (Student S : students) {
            if (S.getCourse() == numCourse) {
                studentOfCourse.add(S.getName());
            }
        }
        if (studentOfCourse.size() == 0) {
            System.out.println("There are no students in this course");
        }
        return studentOfCourse;
    }

    public static void compareToName(List<Student> students) {
        students.sort(Comparator.comparing(Student::getName));
    }

    public static void compareToCourse(List<Student> students) {
        students.sort(Comparator.comparingInt(Student::getCourse).thenComparing(Student::getName));
    }

}