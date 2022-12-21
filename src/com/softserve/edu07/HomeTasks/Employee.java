package com.softserve.edu07.HomeTasks;

import java.util.Comparator;

public class Employee implements Payment, Comparable<Employee> {
    private String name;
    private String employed;

    public Employee(String name, String employed) {
        this.name = name;
        this.employed = employed;
    }

    public String getName(){
        return name;
    }
    @Override
    public double calculatePay() {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employed='" + employed + '\'' +
                '}';
    }

    public static class ByAverageMonthlyWage implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return Double.compare(o2.calculatePay(), o1.calculatePay());
        }
    }

    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.name);
    }
}
