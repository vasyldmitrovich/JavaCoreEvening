package com.softserve.edu03;
/* Roman Sitko. Lesson 3 Introduction to OOP. PracticalTaskEmployee*/
public class Employee {
    private String name;
    private int rate;
    private int hours;
    public static float totalSum = 0.0f;


    public Employee() {
        name = "";
        rate = 0;
        hours = 0;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getBonuses();
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getHours () {
        return hours;
    }

    public void setHours (int hours) {
        this.hours = hours;
    }

    public int getRate () {
        return rate;
    }

    public void setRate (int rate) {
        this.rate = rate;
    }

    public int getSalary() {
        return rate * hours;
    }

    public float getBonuses() {
        float bonus = (float) (getSalary() * 0.1);
        return bonus + getSalary();
    }

    @Override
    public String toString () {
        return "Employee. name: " + name +
                ", rate: " + rate +
                ", hours: " + hours;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Roman", 2, 10);
        Employee employee2 = new Employee("Vasyl", 3, 11);
        Employee employee3 = new Employee("Kateryna", 4, 9);

        System.out.println(employee1);
        System.out.println("Total salary with bonus 10% of employee3 is: " + employee1.getBonuses()+ "\n");

        System.out.println(employee2);
        System.out.println("Total salary with bonus 10% of employee2 is: " + employee2.getBonuses() + "\n");

        System.out.println(employee3);
        System.out.println("Total salary with bonus 10% of employee3 is: " + employee3.getBonuses() + "\n");

        System.out.println("Total bonus for all employees: " + String.format("%.2f", Employee.totalSum));
    }
}
