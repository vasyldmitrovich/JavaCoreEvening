package com.softserve.edu03.HomeworkTask;

public class PersonMain {
    public static void main(String[] args) {

    Person p1 = new Person("Ihor", "Polovenko");
    Person p2 = new Person("Pavlo", "Tabunshchik");
    Person p3 = new Person("Semen", "Kravets");
    Person p4 = new Person("Natalia", "Bila");
    Person p5 = new Person("Emilia", "Holodna");

    p1.inputYear(1990);
    p2.inputYear(1994);
    p3.inputYear(1965);
    p4.inputYear(1979);
    p5.inputYear(1990);

    p1.changeName("Yaro", "Pylypenko");

    System.out.println(p1 + ". " + p1.getAge(p1) + " years old.");
    System.out.println(p2 + ". " + p2.getAge(p2) + " years old.");
    System.out.println(p3 + ". " + p3.getAge(p3) + " years old.");
    System.out.println(p4 + ". " + p4.getAge(p4) + " years old.");
    System.out.println(p5 + ". " + p5.getAge(p5) + " years old.");

    }
}

