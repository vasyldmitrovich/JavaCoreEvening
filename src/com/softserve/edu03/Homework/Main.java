package com.softserve.edu03.Homework;

import java.time.Year;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Oleg", "Petrovuch");
        person1.output();
        person1.setBirthYear(1998);
        person1.output();
        person1.changeFirstNameAndLastName("Nazar", "Petryshyn");
        person1.output();
    }
}
