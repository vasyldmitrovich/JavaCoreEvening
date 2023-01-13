package com.softserve.edu11.MyProjects.PracticalTask1;

import java.io.IOException;
/*Roman Sitko
* Lesson11, practical Tasks*/
public class Main {
    public static void main(String[] args) throws IOException {
/*
        // Practical Task 1
        Text.printCheckText();
*/

/*
        // Practical Task 2
        Text.printName(); // Different string variable
        Text.printName1(); // one string variable
*/

        // Practical Task 3
        System.out.println("Petrenko Petro Petrovych : " + Text.checkWithRegExp("Petrenko Petro Petrovych"));
        System.out.println("Petrenko Petro : " + Text.checkWithRegExp("Petrenko Petro"));
        System.out.println("Petrenko Petro. : " + Text.checkWithRegExp("Petrenko Petro."));
        System.out.println("Petrenko Pe! : " + Text.checkWithRegExp("Petrenko Pe!"));
        System.out.println("Petrenko 4423_ : " + Text.checkWithRegExp("Petrenko 4423_"));
    }
}
