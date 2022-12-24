package com.softserve.edu07.homeWork.Payment;

public abstract class Employee implements Comparable<Employee> {
    float salary;
    String name;
    public abstract String getName();

    public abstract float getSalary();

    public abstract float calculatePay();

    @Override
    public int compareTo(Employee o) {
        if(getSalary() > o.getSalary()){
        return 1;
        } else if
        (getSalary() == o.getSalary()) {
            return 0;
        } else {
            return -1;
        }
    }
}
