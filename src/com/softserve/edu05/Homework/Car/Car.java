package com.softserve.edu05.Homework.Car;

public class Car {
    /* Create class Car with fields type, year of production and engine capacity. Create and
initialize four instances of class Car. Display cars
• certain model year (enter year in the console);
• ordered by the field year*/
    private int yearProd;
    private  String type;
    private  double engineCap;

    public Car(int yearProd, String type, double engineCap) {
        this.yearProd = yearProd;
        this.type = type;
        this.engineCap = engineCap;
    }

    public int getYearProd() {
        return yearProd;
    }

    public void setYearProd(int yearProd) {
        this.yearProd = yearProd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getEngineCap() {
        return engineCap;
    }

    public void setEngineCap(double engineCap) {
        this.engineCap = engineCap;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearProd=" + yearProd +
                ", type='" + type + '\'' +
                ", engineCap=" + engineCap +
                '}';
    }
}
