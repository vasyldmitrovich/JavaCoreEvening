package com.softserve.edu03;
import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    protected int age;


    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }
    public int getBirthYear(){
        return this.birthYear;
    }

    public Person(){
        firstName = "";
        lastName = "";
        birthYear = 0;
    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        birthYear = Integer.parseInt("");
    }
    public Person(String firstName, String lastName, int birthYear ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
    LocalDate current_date = LocalDate.now();
    int current_Year = current_date.getYear();
    public int getAge(){
        age = current_Year - this.birthYear;
        if (age > 110 || age < 0){System.out.println("______ Вкажіть правильний рік народження _____");}
        return age;
    }
    public void input() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Введіть ім'я: ");
        this.firstName = inp.nextLine();
        System.out.println("Введіть прізвище: ");
        this.lastName = inp.nextLine();
        System.out.println("Введіть рік народження: ");
        this.birthYear = inp.nextInt();
    }
    public void output(){
        System.out.println( this.firstName + " " + this.lastName + " - " + getAge());
    }
    public void changeName(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
        return;
    }
}
