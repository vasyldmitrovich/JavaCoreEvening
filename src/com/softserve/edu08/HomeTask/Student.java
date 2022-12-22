package com.softserve.edu08.HomeTask;

public class Student extends Person{
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
    public String activity() {
        return "I study at university";
    }

    @Override
    public String info() {
        return super.info() +" course " + course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", fullName=" + fullName +
                ", age=" + age +
                '}';
    }
}
