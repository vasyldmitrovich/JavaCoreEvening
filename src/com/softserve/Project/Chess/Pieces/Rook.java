package com.softserve.Project.Chess.Pieces;

import com.softserve.Project.Chess.Piece;
import com.softserve.Project.Chess.Position;

public class Rook extends Piece {
    public Rook(String figure, Position position, String color) {
        super(figure, position, color);
    }

    @Override
    public boolean canMove(Position position1, Position position2) {
        return true;
    }
}
