package com.softserve.edu03.PracticalTask;

public class Main {public static void main(String[] args) {
    Employee e1 = new Employee();
    e1.setName("Alen");
    e1.setHours(24);
    e1.setRate(45);

    Employee e2 = new Employee("Alek", 12, 120);
    Employee e3 = new Employee("Andrew", 23, 130);

    System.out.println(e1);
    System.out.println("Salary :"+ e1.getHours()*e1.getRate());
    System.out.println(e2);
    System.out.println("Salary :"+ e2.getHours()*e2.getRate());
    System.out.println(e3);
    System.out.println("Salary :"+ e3.getHours()*e3.getRate());
    System.out.println("\nTotal Salary with bonuses: " + Employee.totalSum);



}
}
