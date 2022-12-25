package com.softserve.edu08.homeWork;

public class AppPerson {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student stud1 = new Student(new FullName("Ivan", "Ivanov"),  22, 4);
        Student stud2 = new Student(new FullName("Petro", "Petrov"),  19, 5);
        System.out.println (stud1.info());
        System.out.println (stud1.activity());
        System.out.println (stud2.info());
        System.out.println (stud2.activity());

        Student stud3 = (Student) stud1.clone();
        stud3.setNumbCourses(9);
        System.out.println (stud3.info());
        System.out.println (stud3.activity());
    }
}
