package com.softserve.edu08.homeTask;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        run();
    }
/*Good all is good*/
    public static void run() throws CloneNotSupportedException {

        Student student1 = new Student(new FullName("Vladyslav", "Siverskiy"), 19, 3);
        Student student2 = new Student(new FullName("Oleh", "Cymbal"), 20, 4);
        Student student3 = (Student) student1.clone();

        student3.setFullName(new FullName("Andriy", "Kobryn"));
        student3.setAge(21);
        student3.setCourse(5);

        print(student1, student2, student3);
    }

    public static void printInfoAndActivity(Student s){
        System.out.println(s.info());
        System.out.println(s.activity());
    }

    public static void print(Student ...students){
        for (Student student: students){
            printInfoAndActivity(student);
        }
    }
}
