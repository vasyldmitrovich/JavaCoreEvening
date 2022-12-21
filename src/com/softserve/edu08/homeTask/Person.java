package com.softserve.edu08.homeTask;

public abstract class Person implements Cloneable{

    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info(){
        return "First name: " + this.fullName.getFirstName() + ", Last name: " + this.fullName.getLastName()
                + ", age: " + this.age;
    }

    public abstract String activity();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person personCopy = (Person) super.clone();
        personCopy.fullName = (FullName) personCopy.fullName.clone();
        return personCopy;
    }
}
