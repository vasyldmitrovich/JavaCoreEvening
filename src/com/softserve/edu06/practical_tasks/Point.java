package com.softserve.edu06.practical_tasks;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public void print() {
        System.out.println(this.getClass().getSimpleName() + " printed");
    }
}
