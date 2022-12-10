package com.softserve.edu03.practicalTask;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += rate * hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        return this.rate * this.hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    public static int getTotalSum() {
        return totalSum;
    }
    public static void run(){
        Employee Dan = new Employee("Dan", 5, 20);
    }


}
