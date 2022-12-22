package com.softserve.edu08.HomeTask;

public abstract class Person implements Cloneable{
    FullName fullName;
    int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info(){
        return "First name: "+fullName.getFirstName()+", Last name: "+fullName.getLastName()+", age: " + age;
    }

    public abstract String activity();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person copyOfPerson = (Person) super.clone();
        copyOfPerson.fullName = (FullName) copyOfPerson.fullName.clone();
        return copyOfPerson;
    }
}
