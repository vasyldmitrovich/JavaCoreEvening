package com.softserve.edu06.PracticalTasks.Line;

public class ColorLine extends Line{
    String color;

    public ColorLine(Point x1y1, Point x2y2, String color) {
        super(x1y1, x2y2);

        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                ", x1y1=" + x1y1 +
                ", x2y2=" + x2y2 +
                '}';
    }
}
