package com.softserve.edu06.PracticalTask.Line;

public class ColorLine extends Line {
    private final String color;

    public ColorLine(Point a, Point b, String color) {
        super(a, b);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                "color='" + color;
    }

    @Override
    public void print() {
        super.print();
    }
}
