package com.softserve.edu06.PracticalTask2;

public class ColorLine extends Line {
    private String color;

    public ColorLine() {

    }

    public ColorLine(Point point1, Point point2, String color) {
        super.point1 = point1;
        super.point2 = point2;
        this.color = color;
    }

    public void print() {
        System.out.println("color: " + color + ", point1= " + point1 + ", point2= " + point2);
    }

    @Override
    public String toString() {
        return "color: " + color;
    }
}