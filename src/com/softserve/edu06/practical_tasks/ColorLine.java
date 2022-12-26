package com.softserve.edu06.practical_tasks;

import java.awt.*;

public class ColorLine extends Line {
    Color color;

    public ColorLine(Point point1, Point point2, Color color) {
        super(point1, point2);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color=" + color +
                ", point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }

    public void print() {
        System.out.println(this.getClass().getSimpleName() + " printed");
    }
}
