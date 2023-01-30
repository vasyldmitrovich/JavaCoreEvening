package com.softserve.Project.Chess.Pieces;

import com.softserve.Project.Chess.Piece;
import com.softserve.Project.Chess.Position;

public class Bishop extends Piece {
    public Bishop(String figure, Position position, String color) {
        super(figure, position, color);
    }

    @Override
    public boolean canMove(Position p1, Position p2) {
        return p2.x() == (p1.x() + 1) & p2.y() == (p1.y() + 1) ||
                p2.x() == (p1.x() + 2) & p2.y() == (p1.y() + 2) ||
                p2.x() == (p1.x() + 3) & p2.y() == (p1.y() + 3) ||
                p2.x() == (p1.x() + 4) & p2.y() == (p1.y() + 4) ||
                p2.x() == (p1.x() + 5) & p2.y() == (p1.y() + 5) ||
                p2.x() == (p1.x() + 6) & p2.y() == (p1.y() + 6) ||
                p2.x() == (p1.x() + 7) & p2.y() == (p1.y() + 7) ||
                p2.x() == (p1.x() + 8) & p2.y() == (p1.y() + 8) ||
                p2.x() == (p1.x() - 1) & p2.y() == (p1.y() - 1) ||
                p2.x() == (p1.x() - 2) & p2.y() == (p1.y() - 2) ||
                p2.x() == (p1.x() - 3) & p2.y() == (p1.y() - 3) ||
                p2.x() == (p1.x() - 4) & p2.y() == (p1.y() - 4) ||
                p2.x() == (p1.x() - 5) & p2.y() == (p1.y() - 5) ||
                p2.x() == (p1.x() - 6) & p2.y() == (p1.y() - 6) ||
                p2.x() == (p1.x() - 7) & p2.y() == (p1.y() - 7) ||
                p2.x() == (p1.x() - 8) & p2.y() == (p1.y() - 8) ||
                p2.x() == (p1.x() + 1) & p2.y() == (p1.y() - 1) ||
                p2.x() == (p1.x() + 2) & p2.y() == (p1.y() - 2) ||
                p2.x() == (p1.x() + 3) & p2.y() == (p1.y() - 3) ||
                p2.x() == (p1.x() + 4) & p2.y() == (p1.y() - 4) ||
                p2.x() == (p1.x() + 5) & p2.y() == (p1.y() - 5) ||
                p2.x() == (p1.x() + 6) & p2.y() == (p1.y() - 6) ||
                p2.x() == (p1.x() + 7) & p2.y() == (p1.y() - 7) ||
                p2.x() == (p1.x() + 8) & p2.y() == (p1.y() - 8) ||
                p2.x() == (p1.x() - 1) & p2.y() == (p1.y() + 1) ||
                p2.x() == (p1.x() - 2) & p2.y() == (p1.y() + 2) ||
                p2.x() == (p1.x() - 3) & p2.y() == (p1.y() + 3) ||
                p2.x() == (p1.x() - 4) & p2.y() == (p1.y() + 4) ||
                p2.x() == (p1.x() - 5) & p2.y() == (p1.y() + 5) ||
                p2.x() == (p1.x() - 6) & p2.y() == (p1.y() + 6) ||
                p2.x() == (p1.x() - 7) & p2.y() == (p1.y() + 7) ||
                p2.x() == (p1.x() - 8) & p2.y() == (p1.y() + 8);
    }
}
