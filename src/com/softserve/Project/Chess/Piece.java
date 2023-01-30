package com.softserve.Project.Chess;

public abstract class Piece {

    private String figure;

    private Position position;
    private int xPos;
    private int yPos;
    private String color;

    public Piece(String figure, int xPos, int yPos, String color) {
        this.figure = figure;
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = color;
    }

    public Piece(String figure, Position position, String color) {
        this.figure = figure;
        this.position = position;
        this.color = color;
    }

    public abstract boolean canMove(Position position1, Position position2);

    public String figure() {
        return figure;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public String color() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Position position() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
