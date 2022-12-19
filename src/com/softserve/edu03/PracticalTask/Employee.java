package com.softserve.edu03.PracticalTask;

public class Employee {
    private String name;
    private double rate;
    private double hours;
    static double totalSum;

    public Employee() {
        this.name = "";
        this.rate = 0;
        this.hours = 0;
    }
    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += (rate * hours);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static double getSalary(Employee e) {
        return e.getRate() * e.getHours();
    }

    /*That method must return double, print use in main method and in that print paste that double data*/
    public static void getTotalSum() {
        System.out.println(totalSum);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
    public static double getBonuses(Employee e) {
        return getSalary(e) * 1.1;
    }
}
