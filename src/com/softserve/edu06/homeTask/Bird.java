package com.softserve.edu06.homeTask;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;
    public abstract void fly();

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
