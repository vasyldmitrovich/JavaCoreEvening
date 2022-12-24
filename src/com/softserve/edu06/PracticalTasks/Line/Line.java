package com.softserve.edu06.PracticalTasks.Line;

/*It is not necessary extends Point*/
public class Line extends Point{
     Point x1y1;
     Point x2y2;


    public Line(Point x1y1, Point x2y2) {
        super();
        this.x1y1 = x1y1;
        this.x2y2 = x2y2;
    }



    public Point getX1y1() {
        return x1y1;
    }

    public void setX1y1(Point x1y1) {
        this.x1y1 = x1y1;
    }

    public Point getX2y2() {
        return x2y2;
    }

    public void setX2y2(Point x2y2) {
        this.x2y2 = x2y2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "x1y1=" + x1y1 +
                ", x2y2=" + x2y2 +
                '}';
    }
}

