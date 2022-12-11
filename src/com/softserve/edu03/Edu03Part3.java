package com.softserve.edu03;

import java.time.LocalDate;

/**
 * HOMEWORK
 */
public class Edu03Part3 {
    public static void main(String[] args) {
        Person tom = new Person("Tom", "Cruise");
        tom.setBirthYear(1962);
        tom.input("Known professionally as Tom Cruise, is an American actor and producer");

        Person leonardo = new Person("Leonardo", "DiCaprio");
        leonardo.setBirthYear(1974);
        leonardo.input("Is an American actor and film producer");

        Person johnny = new Person("Johnny", "Depp");
        johnny.setBirthYear(1963);
        johnny.input(" He is the recipient of multiple accolades, including a Golden Globe Award");

        Person bradley = new Person();
        bradley.setFirstName("Bradley");
        bradley.setLastName("Pitt");
        bradley.setBirthYear(1963);
        bradley.input("Born William Bradley Pitt on December 18, 1963, in Shawnee, actor Brad Pitt can trace his Oklahoma roots as far back as the 1889 Land Run era");

        Person willard = new Person();
        willard.setFirstName("Willard");
        willard.setLastName("Smith");
        willard.setBirthYear(1968);
        willard.input("Willard Carroll Smith, Jr., better known as Will Smith, actor, rap and recording artist, was born in Wynnefield");

        System.out.println("FirstName: " + willard.getFirstName());
        System.out.println("LastName: " + willard.getLastName());
        System.out.println("BirthYear: " + willard.getBirthYear());
        System.out.println("information about person: " + willard.output());
        System.out.println("age of person: " + willard.getAge());

        willard.changeName("New LastName");
        System.out.println("LastName: " + willard.getLastName());
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private String info;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Person() {//default constructor
    }

    public Person(String firstName, String lastName) {//Constructor with parameters
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() { //to calculate the age of person
        return LocalDate.now().getYear() - this.birthYear;
    }

    public void input(String info) { //to input information about person
        this.info = info;
    }

    public String output() {//to output information about person
        return this.info;
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public void changeName(String ln) {
        this.lastName = ln;
    }
/*    public void changeName(String fn){
        this.firstName=fn;
     }*/
}
