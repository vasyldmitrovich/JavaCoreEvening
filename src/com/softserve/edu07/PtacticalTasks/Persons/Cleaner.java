package com.softserve.edu07.PtacticalTasks.Persons;

public class Cleaner extends Staff {
    final String TYPE_PERSON = "cleaner";

    private int amountOfSalary;

    public Cleaner(String name, int amountOfSalary) {
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
    public void salary() {
        System.out.println("Salary is "+this.amountOfSalary+".");
    }

    @Override
    public void print() {
        System.out.println("Name: "+this.getName()+". Type is "+TYPE_PERSON+".");
    }
}
