package com.softserve.edu03.homeTask;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }


    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input birth year");
        birthYear = scan.nextInt();
    }


    public String output() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public void changeName(String fn, String ln) {
        firstName = !fn.isBlank() ? fn : firstName;
        lastName = !ln.isBlank() ? ln : lastName;
    }

    /*Move main method to another class for example public class AppMain
    * and in that class do like i wrote in class Main in package practicalTask*/
    public static void main(String[] args) {
        Person person1 = new Person("Mike", "Tyson");
        person1.input();
        System.out.println(person1.getAge() + " years");
        System.out.println(person1.output());
        person1.changeName("Tyson", "Fury");
        System.out.println(person1.output());
        person1.changeName("", "  ");
        System.out.println(person1.output());

    }
}
