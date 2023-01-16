package com.softserve.edu10.Homework_3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;
    private int course;

    public Student() {
        this.name = "";
        this.course = -1;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int course() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        System.out.println("Student on " + course + " course:");
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.course() == course) {
                System.out.println(student);
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }

    public static class ByName implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);
        }
    }

    public static class ByCourse implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.course - s2.course;
        }
    }
}
