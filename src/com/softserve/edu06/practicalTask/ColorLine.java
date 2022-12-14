package com.softserve.edu06.practicalTask;

import java.security.PrivateKey;

public class ColorLine extends Line{
    private String color;
    private Point point1;
    private Point point2;

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }
    @Override
    public void print(){
        System.out.println(this.getClass().getSimpleName() + " is printing");
    }

    @Override
    public String toString() {
        return super.toString() + " with color " + color;

    }
}
