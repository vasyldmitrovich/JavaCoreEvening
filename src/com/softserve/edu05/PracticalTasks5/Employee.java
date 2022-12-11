package com.softserve.edu05.PracticalTasks5;

import java.util.Arrays;

public class Employee {
    private String name;
    private int numberDepartment;
    private int salary;

    public Employee(String name, int numberDepartment, int salary) {
        this.name = name;
        this.numberDepartment = numberDepartment;
        this.salary = salary;
    }

    public Employee() {
        name = "";
        numberDepartment = 0;
        salary = 0;
    }

    public int getNumberDepartment(){
        return numberDepartment;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", numberDepartment=" + numberDepartment +
                ", salary=" + salary +
                '}';
    }

    static void belongDepartment(int num, Employee ... employees){
        System.out.println("There are employees in department "+num);
        for (Employee emp: employees){
            if (emp.getNumberDepartment() == num){
                System.out.println(emp.toString());
            }
        }
    }

    static void arrangeEmployee(Employee ... employees){

        Employee tmpEmp;

        for (int i = 0; i < employees.length-1; i++) {
            for (int j = i+1; j < employees.length ; j++) {
                if (employees[i].getSalary()<employees[j].getSalary()) {
                    tmpEmp = employees[i];
                    employees[i]=employees[j];
                    employees[j] = tmpEmp;
                }
            }
        }

        System.out.println("\nArranged workers:");
        for (Employee employee: employees
             ) {
            System.out.println(employee.toString());
        }
    }
}
