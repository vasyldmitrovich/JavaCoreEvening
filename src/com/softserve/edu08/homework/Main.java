package com.softserve.edu08.homework;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        createStudents();
    }
    public static void createStudents() throws CloneNotSupportedException {
        Student student1 = new Student(new FullName("Volodymyr","Klitschko"),18,20047);
        Student student2 = new Student(new FullName("Vasyl","Virastiuk"),22,35114);


        System.out.println(student1.activity());
        System.out.println(student1.info());
        System.out.println("==========================================================================");

        System.out.println(student2.activity());
        System.out.println(student2.info());
        System.out.println("==========================================================================");
        Student copyStudent = (Student) student1.clone();
        copyStudent.setCourse(12345);

        System.out.println(copyStudent.activity());
        System.out.println(copyStudent.info());
        System.out.println("==========================================================================");

    }
}
