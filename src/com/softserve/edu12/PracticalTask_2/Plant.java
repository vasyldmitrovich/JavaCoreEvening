package com.softserve.edu12.PracticalTask_2;

public class Plant {

    private int size;
    private Color color;
    private Type type;

    public Plant() {
        this.size = -1;
        this.color = null;
        this.type = null;
    }

    public Plant(int size, String color, String type) throws ColorException, TypeException {
        this.size = size;
        if (containsColor(color)) {
            this.color = Color.valueOf(color.toUpperCase());
        } else {
            this.color = Color.DEFAULT;
            throw new ColorException("No such color.", "111");
        } if (containsType(type)) {
           this.type = Type.valueOf(type.toUpperCase());
        } else {
            this.type = Type.DEFAULT;
            throw new ColorException("No such type.", "222");

        }
    }

    public int size() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color color() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type type() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean containsColor(String string) throws ColorException {
        for (Color color : Color.values()) {
            if (color.name().equals(string.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    public boolean containsType(String string) throws TypeException {
        for (Type type : Type.values()) {
            if (type.name().equals(string.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
