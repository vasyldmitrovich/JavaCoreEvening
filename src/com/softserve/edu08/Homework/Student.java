package com.softserve.edu08.Homework;

public class Student extends Person implements Cloneable{

    private int course;

    public Student() {
        this.course = -1;
    }

    public Student(int course) {
        this.course = course;
    }

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course + '.';
    }

    public int course() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [" + "course = " + course + ']';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
