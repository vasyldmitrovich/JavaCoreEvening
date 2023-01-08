package com.softserve.edu10.MyProjects.Homework2;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student>{
    private String name;
    private int course;

    public static class ByCourse implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getCourse() - s2.getCourse();
        }
    }

    public static class ByName implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getName().compareTo(s2.getName());
        }
    }

    public Student() {

    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void printStudents (List students, Integer course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student current = iterator.next();
            if(current.getCourse() == course) {
                System.out.println("Course: " + current.getCourse() + ", student name: " + current.getName());
            } else {
                System.out.println("Wrong name of course");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "\nStudent [course=" + course
                + ", name=" + name
                + "]";
    }

    @Override
    public int compareTo(Student student) {
        return name.compareTo(student.getName());
    }

}
