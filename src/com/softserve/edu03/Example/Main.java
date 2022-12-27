package com.softserve.edu03.Example;

import static com.softserve.edu03.Example.Student.avgRating;
import static com.softserve.edu03.Example.Student.getRatingSum;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Oleg", 5.9);
        Student student2 = new Student("Igor", 3.1);
        Student student3 = new Student("Ira", 6.3);
        System.out.println(getRatingSum());
        System.out.println(avgRating());
        System.out.println(student1.betterStudent(student2));

    }
}
