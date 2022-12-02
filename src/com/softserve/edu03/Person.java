package com.softserve.edu03;

public class Person {
    private String FirstName;
    private String LastName;
    private int birthYear;
    int age;

    public Person(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
      public void inputYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public int getAge(Person s) {
        return age = 2022 - s.birthYear;
    }
    public void changeName(String fn, String ln) {
        FirstName = fn;
        LastName = ln;
    }
    @Override
    public String toString() {
        return "FirstName = " + FirstName + "; Last name = " + LastName;
        }
    }

