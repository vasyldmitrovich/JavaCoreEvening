package com.softserve.edu03.PracticalTask;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    double salary;
    private static double totalSum;

    public Employee(String name) {
        this.name = name;
    }
    public Employee() {
        name = "";
    }
       public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
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
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public static double getTotalSum() {
        return totalSum;
    }
    public double getSalary() {
        totalSum += hours*rate;
      return hours*rate;
    }
    public double getBonuses() {
        return hours * rate * 0.1;
    }

    @Override
    public String toString() {
        return "Employee" +
                " name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours;
    }
}

