package com.softserve.edu12.practicalTask.Task2;

public class Plant {

    int size;
    Color color;
    Type type;

    public Plant(int size, String color, String type) throws ColorException, TypeException {
        Color colorIn = colorStrToEnum(color);
        Type typeIn = typeToStrEnum(type);
        this.color = colorIn;
        this.type = typeIn;
        this.size = size;
    }

    private static Type typeToStrEnum(String type) throws TypeException {
        switch (type.toLowerCase()){
            case "rose":
                return Type.ROSE;
            case "chamomile":
                return Type.CHAMOMILE;
            case "chrysanthemum":
                return Type.CHRYSANTHEMUM;
            default:
                throw new TypeException("No such flower");
        }
    }

    private static Color colorStrToEnum(String color) throws ColorException {
        switch (color.toLowerCase()){
            case "white":
                return Color.WHITE;
            case "red":
                return Color.RED;
            case "blue":
                return Color.BLUE;
            default:
                throw new ColorException("No such color");
        }
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
