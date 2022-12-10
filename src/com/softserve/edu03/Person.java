package com.softserve.edu03;

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

    private int getAge(Person a){
        return age = Year - a.birthYear;
    }

    @Override
    public String toString() {return "FirstName"  + firstName + ", LastName" + lastName + "Age" + age ;
    }

    public static void main (String[] args){
        Person Person1 = new Person("Марія", "Петрова", 1952);
        Person Person2 = new Person("Анна", "Іванова", 1993);
        Person Person3 = new Person("Сергій", "Триньков", 1927);
        Person Person4 = new Person("Микола", "Петров", 2002);
        Person Person5 = new Person("Ольга", "Квіткова", 1917);

        System.out.println(Person1);
        System.out.print("Person1", Person1.getAge());
        System.out.println(Person2);
        System.out.print("Person2", Person2.getAge());
        System.out.println(Person3);
        System.out.print("Person3", Person3.getAge());
        System.out.println(Person4);
        System.out.print("Person4", Person4.getAge());
        System.out.println(Person5);
        System.out.print("Person5", Person5.getAge());

    }

}
