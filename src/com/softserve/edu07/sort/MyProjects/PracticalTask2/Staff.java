package com.softserve.edu07.sort.MyProjects.PracticalTask2;

abstract public class Staff extends Person {
    private float salary;

    public Staff () {

    }

    public Staff(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary (float salary) {
        this.salary = salary;
    }

    abstract public float salary();

    @Override
    void print() {
        System.out.println("Salary staff is: " + salary);
    }
}
