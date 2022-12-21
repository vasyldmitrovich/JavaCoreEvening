package com.softserve.edu07.PtacticalTasks;

public class Teacher extends Staff{
    final String TYPE_PERSON = "teacher";
    private int amountOfSalary;

    public Teacher(String name, int amountOfSalary) {
        this.amountOfSalary = amountOfSalary;
        setName(name);
    }

    public int getAmountOfSalary() {
        return amountOfSalary;
    }

    public void setAmountOfSalary(int amountOfSalary) {
        this.amountOfSalary = amountOfSalary;
    }

    @Override
    void salary() {
        System.out.println("Salary is "+this.amountOfSalary+".");
    }

    @Override
    void print() {
        System.out.println("Name: "+this.getName()+" .Type is "+TYPE_PERSON+".");
    }
}
