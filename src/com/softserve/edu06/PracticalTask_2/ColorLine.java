package com.softserve.edu06.PracticalTask_2;

public class ColorLine extends Line {
    private final String color;

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    public void print(Object o) {
        System.out.println(o);
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                ", point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }
}
