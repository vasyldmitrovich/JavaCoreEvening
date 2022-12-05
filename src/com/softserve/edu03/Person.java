package com.softserve.edu03;
import java.time.Year;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private static int countEmployees = 0;

    public Person () {
        firstName = "";
        lastName = "";
        birthYear = 0;
    }

    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear () {
        return birthYear;
    }

    public int getAge () {
        int year = Year.now().getValue();
        return year - birthYear;
    }

    public void input (String firstName, String lastName, int birthYear) throws Exception {
        this.firstName = firstName;
        this.lastName = lastName;
        if (birthYear > 1920 && birthYear < 2010) {
            this.birthYear = birthYear;
        } else {
            throw new Exception("Birth year should be bigger 1920 and less 2010");
        }
        countEmployees += 1;
    }

    public void output () {
        System.out.println("Employee: " + countEmployees + ". First Name: " + firstName +
                ", Last Name: " + lastName +
                ", Year: " + getAge());
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public static void main (String[] args) throws Exception {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.input("Roman", "Petrenko", 1989);
        person1.output();

        person2.input("Viktor", "Kyzyo", 1996);
        person2.output();

        person3.input("Stepan", "Fido", 2002);
        person3.output();

        person4.input("Maria", "Myrnyj", 1975);
        person4.output();

        person5.input("Oleg", "Romanenko", 2000);
        person5.output();

    }
}
