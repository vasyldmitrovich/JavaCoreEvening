package com.softserve.edu03.PracticalTask;

public class Employee {
    static int totalSum;
    private String name;
    private int rate;
    private int hours;

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
        totalSum -= salary() + bonuses();
        this.rate = rate;
        totalSum += salary() + bonuses();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        totalSum -= salary() + bonuses();
        this.hours = hours;
        totalSum += salary() + bonuses();
    }

    public Employee() {
        totalSum += salary() + bonuses();
    }

    public Employee(String name, int rate) {
        this.name = name;
        setRate(rate);
        totalSum += salary() + bonuses();
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        setRate(rate);
        setHours(hours);
        totalSum += salary() + bonuses();
    }

    int salary() {
        return rate * hours;
    }

    int bonuses() {
        return salary() / 10;
    }



    @Override
    public String toString() {
        String info = String.format("Name: %1$s, Rate: %2$s, Hours: %3$s", getName(), getRate(), getHours());
        return info;
    }

    public static void main(String[] args) {

    }
}
