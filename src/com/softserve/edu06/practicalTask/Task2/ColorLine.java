package com.softserve.edu06.practicalTask.Task2;

public class ColorLine extends Line{

    private String color;

    public ColorLine(Point firstPoint, Point secondPoint, String color) {
        super(firstPoint, secondPoint);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                ", firstPoint=" + firstPoint +
                ", secondPoint=" + secondPoint +
                '}';
    }
}
