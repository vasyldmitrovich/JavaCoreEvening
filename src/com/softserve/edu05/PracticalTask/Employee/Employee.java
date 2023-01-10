package com.softserve.edu05.PracticalTask.Employee;



public class Employee {

        private String name;
        private int salary;
        private int department_number;

    public Employee(String name, int salary, int department_number) {
        this.name = name;
        this.salary = salary;
        this.department_number = department_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /*Naming method is not correct, use Camel Case style*/
    public int getDepartmentNumber() {
        return department_number;
    }

    public void setDepartmentNumber(int department_number) {
        this.department_number = department_number;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department_number=" + department_number +
                '}';
    }
}

