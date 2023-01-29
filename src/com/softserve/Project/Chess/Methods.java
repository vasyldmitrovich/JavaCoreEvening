package com.softserve.Project.Chess;

import com.softserve.Project.Chess.Pieces.EmptySpace;

import java.util.Scanner;

import static com.softserve.Project.Chess.ChessBoard.outputBoard;

public class Methods {

    public String inPut() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public Position position(String string) {
        return Position.valueOf(string.toUpperCase());
    }

    public Piece[][] move(Piece[][] pieces, Position figureCoordinates, Position move) {


        pieces[move.x()][move.y()] = pieces[figureCoordinates.x()][figureCoordinates.y()];
        pieces[figureCoordinates.x()][figureCoordinates.y()] = new EmptySpace("-", figureCoordinates, "y");
        return pieces;
    }
}
