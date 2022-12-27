package com.softserve.edu08.MyProjects.Homework;

import com.softserve.edu08.MyProjects.PracticalTask1.Department;

public class Student extends Person {
    private int numCourse;
   // private FullName fullName;

    public Student(FullName fullName, int numCourse, int age) {
        this.numCourse = numCourse;
        super.setAge(age);
        super.setFullName(fullName);
    }

    @Override
    public String info() {
        return super.info() + ", Number of course: " + numCourse + "\"";
    }

    @Override
    public String activity() {
        return "Student is study at university";
    }


}
