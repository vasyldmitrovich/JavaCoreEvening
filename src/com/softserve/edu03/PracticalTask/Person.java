package com.softserve.edu03.PracticalTask;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int age;
    int Year = 2022;


    public Person(String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String FirstName){
        firstName = FirstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String LastName){
        lastName = LastName;
    }

    public int getAge(){ return getAge(); }
    public void setAge(int age) { age = age; }


    private int getAge(Person a){
        return age = Year - a.birthYear;
    }

    @Override
    public String toString() {return "FirstName"  + firstName + ", LastName" + lastName + "Age" + age ;
    }

    /*Move that main method to another class unique class like public class App DONE*/


}
