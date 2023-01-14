package com.softserve.edu08.Homework;

public class AppMain {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person[] people = {
                new Student(new FullName("Nazar", "Petryshyn"), 24, 6),
                new Student(new FullName("Marik", "Bohonis"), 22, 5)
        };
        for (Person person : people) {
            System.out.println(person.info());
            System.out.println(person.activity());
        }

        System.out.println("--------------------------");
        Student student = (Student) people[0].clone();
        student.setCourse(8);
        for (Person person : people) {
            System.out.println(person.info());
        }
        System.out.println(student.info());
    }
}
