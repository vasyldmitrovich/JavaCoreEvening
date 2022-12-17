package com.softserve.edu06.PracticalTasks;

public class ColorLine extends Line{
    String Color;

    public ColorLine(Point p1, Point p2, String color) {
        super(p1, p2);
        Color = color;
    }

    @Override
    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "\nColorLine{" +
                "Color='" + Color + '\'' +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
