package com.softserve.edu06.PracticalTask2;

public class Point {
    private double x, y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("x= " + x + ", y" + y);
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y;
    }
}
