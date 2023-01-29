package com.softserve.Project.Chess.Pieces;

import com.softserve.Project.Chess.Piece;
import com.softserve.Project.Chess.Position;

public class Edge extends Piece {
    public Edge(String figure, int xPos, int yPos, String color) {
        super(figure, xPos, yPos, color);
    }

    @Override
    public boolean move(Position position1, Position position2) {
        return true;
    }
}
