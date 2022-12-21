package com.softserve.edu08.homeTask;

public class Student extends Person implements Cloneable {
    private FullName fullName;
    private int courseNumber;

    public Student(FullName fullName, int age, int courseNumber) {
        super(fullName, age);
        this.fullName = fullName;
        this.courseNumber = courseNumber;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(", Course number: " + courseNumber);
    }

    @Override
    public String activity() {
        return "I am studying";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
      Student studentCopy = (Student) super.clone();
      fullName = (FullName) studentCopy.fullName.clone();
      return studentCopy;
    }
}
