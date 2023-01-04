package com.softserve.edu10.homeWork.Student;

import com.softserve.edu06.practicalTasks.car.UserEnter;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private Integer course;

    public Student(String name, int course){
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

    public static void printStudent(List<Student> student){
        UserEnter.UserEnterNum("Введіть номер курсу на якому навчаються студенти: ");
        int course = UserEnter.numb;
        boolean indicate = true;
        for (Student element: student) {
            if(element.getCourse() == course){
                System.out.println(element.name);
                indicate = false;
            }
        }
        if (indicate){
            System.out.println("На даному курсі студентів немає або ви ввели невірні дані");
        };


    }
    public static class CompareByAge implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2) {
        if(student1.course - student2.course == 0){
            return 0;
        } else {
            return student1.course > student2.course ? 1 : -1;
        }
    }
    }

    public static class CompareByName implements Comparator<Student>{
        @Override
        public int compare(Student student1, Student student2) {
                return student1.name.compareTo(student2.name);
        }
    }

        @Override
        public String toString(){
            return "Name: " + name + ", course: " + course;
        }
}
