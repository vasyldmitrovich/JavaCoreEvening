package com.softserve.edu06.MyProjects.PracticalTask2;

public class ColorLine extends Line {
    private String color;

    public ColorLine() {

    }

    public ColorLine(String color) {
        this.color = color;
    }

    public void print() {
        System.out.println("color: " + color);
    }

    @Override
    public String toString() {
        return "color: " + color;
    }
}