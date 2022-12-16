package com.softserve.edu06.PracticalTask.Line;

public class Line {
    Point a;
    Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }
    public void print() {
        System.out.println(this.getClass().getSimpleName() + " has been printed");
    }

    @Override
    public String toString() {
        return "Line{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
