package com.softserve.edu06.practical_tasks;

public class Line {
    Point point1;
    Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }
    public void print() {
        System.out.println(this.getClass().getSimpleName() + " printed");
    }
}
