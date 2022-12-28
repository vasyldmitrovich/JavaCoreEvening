package com.softserve.edu10.homeTask;


import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Student {
    private String name;
    private int courseNumber;

    public Student(String name, int courseNumber) {
        this.name = name;
        this.courseNumber = courseNumber;
    }

    public String getName() {
        return name;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public static class compareByName implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class compareByCourse implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCourseNumber() - o2.getCourseNumber();
        }
    }

    public static void printStudents(List<Student> students, int courseNumber) {
        ListIterator<Student> iterator = students.listIterator();
        System.out.println("Students on " + courseNumber + " course");
        while (iterator.hasNext()) {
            int index = iterator.nextIndex();
            if (iterator.next().getCourseNumber() == courseNumber) {
                System.out.println(students.get(index));
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courseNumber=" + courseNumber +
                '}';
    }
}
