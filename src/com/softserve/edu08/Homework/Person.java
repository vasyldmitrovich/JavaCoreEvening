package com.softserve.edu08.Homework;

public abstract class Person implements Cloneable{

    private FullName fullName;
    private int age;

    public Person() {
        this.fullName = new FullName();
        this.age = -1;
    }

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName fullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.firstName() + ", Last name: " + fullName.lastName() + ", Age: " + age + '.';
    }

    public abstract String activity();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
