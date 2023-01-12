package com.softserve.edu08.homework;

public class Student extends Person implements Cloneable {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return "First name: " + this.getFullName().getFirstName() + ", Last name: " + this.getFullName().getLastName() + ", Age: " + this.getAge() + ", Course number: " + this.getCourse();
    }

    @Override
    public String activity() {

        return "I study at university";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
