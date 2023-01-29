package com.softserve.edu12.Task2;

public class Plant {

    private final Type type;
    private final Color color;
    private final int size;

    public Plant(String type, String color, int size) throws ColorException, TypeException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }

    private Color colorStrToEnum(String color) throws ColorException{
        return switch (color.toLowerCase()) {
            case "green" -> Color.green;
            case "orange" -> Color.orange;
            case "yellow" -> Color.yellow;
            default -> throw new ColorException("Input only color green, orange or yellow");
        };
    }

    @SuppressWarnings("MismatchedStringCase")
    private Type typeStrToEnum(String type) throws TypeException{
        return switch (type.toLowerCase()) {
            case "Watermelon" -> Type.Watermelon;
            case "Pear" -> Type.Pear;
            case "Persimmon" -> Type.Persimmon;
            default -> throw new TypeException("Input only type Watermelon, Pear or Persimmon");
        };
    }
    @Override
    public String toString() {
        return "Plant{" +
                "size=  " + size +
                ", color=  " + color +
                ", type=  " + type +
                '}';

    }

}