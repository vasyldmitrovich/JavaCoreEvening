package com.softserve.edu06.PracticalTasks.Lines;

public class Line {
    Point p1, p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void print(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "\nLine{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
