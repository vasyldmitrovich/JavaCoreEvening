package com.softserve.edu03.PracticalTask;

public class Main {public static void main(String[] args) {
    Employee e1 = new Employee();
    e1.setName("Alen");
    e1.setHours(24);
    e1.setRate(45);

    Employee e2 = new Employee("Alek", 12, 120);
    Employee e3 = new Employee("Andrew", 23, 130);

    System.out.println(e1.toString());
    System.out.println(e2.toString());
    System.out.println(e3.toString());
    System.out.println("\nTotal Salary: " + Employee.totalSum);


}
}
