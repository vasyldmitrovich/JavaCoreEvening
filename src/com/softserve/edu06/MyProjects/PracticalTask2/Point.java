package com.softserve.edu06.MyProjects.PracticalTask2;

public class Point {
    private int x, y;

    public Point() {

    }

    public Point(int x, int y) {
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
