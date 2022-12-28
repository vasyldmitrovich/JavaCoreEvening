package com.softserve.edu10.homeTask.Task3;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Student implements Comparable<Student>{

    //
    private static Comparator<Student> namesComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static Comparator<Student> compareByNames(){
        return namesComparator;
    }

    public static void printStudents(List<Student> students, int course){
        ListIterator<Student> studentListIterator = students.listIterator();

        while (studentListIterator.hasNext()){
            Student student = studentListIterator.next();
            if(student.getCourse() == course){
                System.out.println(student.getName());
            }
        }
    }

    //to sort by courses
    @Override
    public int compareTo(Student o) {
        return this.getCourse() - o.getCourse();
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
