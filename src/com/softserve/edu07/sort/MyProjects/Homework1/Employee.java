package com.softserve.edu07.sort.MyProjects.Homework1;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private String employeeId;
    private String name;
    private float salary;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public float getSalary () {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public int compareTo(Employee emp) {
        return 0;
        //return (int)(-salary + emp.salary);
    }

    public static class BySal implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return (int) (-emp1.salary + emp2.salary);
        }
    }
}
