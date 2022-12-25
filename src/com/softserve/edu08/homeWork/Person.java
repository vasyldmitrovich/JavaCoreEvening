package com.softserve.edu08.homeWork;

public abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String info(){
        return "First name: " + fullName.getFirstName() + " , last name: " + fullName.getLastName() + " , age: " + getAge() + ". ";
    }
    public abstract String activity();
}

