package com.softserve.edu08.homeWork;

public class Student extends Person implements Cloneable{
    private int numbCourse;

    public Student(FullName fullName, int age, int numbCourse) {
        super(fullName, age);
        this.numbCourse = numbCourse;
    }

    public int getNumbCourses(){
            return numbCourse;
    }

    public void setNumbCourses(int numbCourses) {
        this.numbCourse = numbCourses;
    }

    @Override
    public String info(){
        return super.info() + "Course the student is taking: " + numbCourse;
    }

    @Override
    public String activity() {
        return "I am study at university";
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
