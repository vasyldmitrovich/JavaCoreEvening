package com.softserve.edu10.Homework;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static class CompareByName implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class CompareByCourse implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getCourse() - o1.getCourse();
        }
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

    public static void printStudents(List<Student> s, int course) {
        ListIterator<Student> listIterator = s.listIterator();
        while (listIterator.hasNext()) {
            int key = listIterator.nextIndex();
            if ((listIterator.next().getCourse()) == course) {
                System.out.println(s.get(key));
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
}