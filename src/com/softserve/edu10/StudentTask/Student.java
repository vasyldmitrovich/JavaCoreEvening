package com.softserve.edu10.StudentTask;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

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

    public static void printStudents(List<Student> students, Integer course){
        boolean findStudent = false;

        Iterator iterator = students.iterator();

        Student student;
       while (iterator.hasNext()){
           student = (Student) iterator.next();
           if (student.getCourse()==course){
               System.out.println(student.getName());
               findStudent = true;
           }
       }

       if (!findStudent){
           System.out.println("Students didn't find");
       }
    }

    public static class NameComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return  o1.getName().compareTo(o2.getName());
        }
    }

    public static class CourseComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return  o1.getCourse()-o2.getCourse();
        }
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

}
