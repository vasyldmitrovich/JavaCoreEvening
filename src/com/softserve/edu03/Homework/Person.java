package com.softserve.edu03.Homework;

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastname;
    private int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Person() {
        this.firstName = "";
        this.lastname = "";
        this.birthYear = 0;
    }

    public Person(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void getAge() {
        System.out.println(firstName + " is years " + (Year.now().getValue() - birthYear) + " old.");
    }

    public void input(){
        System.out.println("Input information about Person. First comes the first name:");
        Scanner scanner = new Scanner(System.in);
        firstName = scanner.nextLine();
        System.out.println("Input the last name:");
        lastname = scanner.nextLine();
        System.out.println("Input the year of the birthday:");
        birthYear = scanner.nextInt();
        scanner.close();
    }

    public void output() {
        System.out.println("Person first name: " + firstName + "\nPerson last name: " + lastname + "\nPerson year of birthday: " + birthYear);
    }

    public void changeFirstName(String fn) {
        firstName = fn;
    }
    public void changeLastName(String ln) {
        lastname = ln;
    }
    public void changeFirstNameAndLastName(String fn, String ln) {
        firstName = fn;
        lastname = ln;
    }
}
