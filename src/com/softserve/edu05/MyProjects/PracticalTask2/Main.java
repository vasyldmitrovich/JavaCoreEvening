package com.softserve.edu05.MyProjects.PracticalTask2;

import java.io.IOException;
/* Roman Sitko. L5, Practical tasks 2
*Create a class Employee with fields name, department number, salary. Create five objects of class Employee.
* Display:
* - all employees of a certain department (enter department number in the console);
* - arrange workers by the field salary in descending order.
* */
public class Main {
    public static void main(String[] args) throws IOException {
        int numDep = 0;

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Roman Spot", 2, 235.5f);
        employees[1] = new Employee("Andriy Jordan", 2, 245f);
        employees[2] = new Employee("Mark Twen", 3, 250.5f);
        employees[3] = new Employee("Olya Oyishu", 1, 210.5f);
        employees[4] = new Employee("Bob King", 3, 240f);

        Employee.outputNameByDep(employees);
        Employee.orderBySal(employees);
    }
}