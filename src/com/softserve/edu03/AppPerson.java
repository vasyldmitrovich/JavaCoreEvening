package com.softserve.edu03;



public class AppPerson {
    public static void main(String [] args){
        Person person1 = new Person();
        Person person2 = new Person("Vasyl", "Koval", 1985);
        Person person3 = new Person("Iryna", "Ostapenko", 2001);
        Person person4 = new Person("Valentyna", "Slyvka", 1998);
        Person person5 = new Person("Bohdan", "Nazaruk", 1978);
        person1.input();
        person1.output();
        System.out.println("______  З заданими параметрами: ________");
        person2.output();
        person3.output();
        person4.output();
        person5.output();

        person5.changeName("Ihor", "Ivaskiv");
        System.out.println("_______   Дані після внесених змін: ________ ");
        person5.output();


    }
}
