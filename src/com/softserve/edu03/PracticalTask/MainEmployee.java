package com.softserve.edu03.PracticalTask;

import com.softserve.edu03.PracticalTask.Employee;

public class MainEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Oleksandr", 1.0, 8 );
        Employee e2 = new Employee("Kira", 3.0, 8);
        Employee e3 = new Employee();
        e3.setName("Emilija");
        e3.setRate(2.0);
        e3.setHours(15);

        System.out.println(e1 + " receive salary: "
                + e1.getSalary() +"; get bonuses:" + e1.getBonuses());
        System.out.println(e2 + " receive salary: "
                + e2.getSalary() +"; get bonuses:" + e2.getBonuses());
        System.out.println(e3 + " receive salary: "
                + e3.getSalary() +"; get bonuses:" + e3.getBonuses());

        System.out.println("Total earnings = " + Employee.getTotalSum());
    }
}
