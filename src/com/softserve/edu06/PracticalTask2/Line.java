package com.softserve.edu06.PracticalTask2;

public class Line {
    Point point1;
    Point point2;

    public Line() {

    }

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public void print() {
        System.out.println("point1: " + point1.toString() +
                ", point2: " + point2.toString());
    }

    @Override
    public String toString() {
        return "point1: " + point1.toString() +
                ", point2: " + point2.toString();
    }
}
