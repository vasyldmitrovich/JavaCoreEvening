package com.softserve.Project.Chess;

import com.softserve.Project.Chess.Pieces.*;

public class ChessBoard {

    private final Piece[][] pieces = new Piece[9][9];

    public static void outputBoard(Piece[][] pieces) {

        for (Piece[] line : pieces) {
            System.out.println();
            for (Piece piece : line) {
                if (piece.color().equals("W")) {
                    System.out.print(" " + piece.figure() + " ");
                } else if (piece.color().equals("B")){
                    System.out.print(" " + "\u001B[30m" + piece.figure() + "\u001B[0m" + " ");
                } else {
                    System.out.print(" " + "\u001B[33m" + piece.figure() + "\u001B[0m" + " ");
                }
            }
        }
    }

    public Piece[][] initialBoard() {
        pieces[0][0] = new Edge("1",0, 0, "Y");
        pieces[0][1] = new Rook("R",Position.A1, "B");
        pieces[0][2] = new Horse("H",Position.B1, "B");
        pieces[0][3] = new Bishop("B",Position.C1, "B");
        pieces[0][4] = new Queen("Q",Position.D1, "B");
        pieces[0][5] = new King("K",Position.E1, "B");
        pieces[0][6] = new Bishop("B",Position.F1, "B");
        pieces[0][7] = new Horse("H",Position.G1, "B");
        pieces[0][8] = new Rook("R",Position.H1, "B");
        pieces[1][0] = new Edge("2",1, 0, "Y");
        pieces[1][1] = new EmptySpace("P",Position.A2, "B");
        pieces[1][2] = new EmptySpace("P",Position.B2, "B");
        pieces[1][3] = new EmptySpace("P",Position.C2, "B");
        pieces[1][4] = new EmptySpace("P",Position.D2, "B");
        pieces[1][5] = new EmptySpace("P",Position.E2, "B");
        pieces[1][6] = new EmptySpace("P",Position.F2, "B");
        pieces[1][7] = new EmptySpace("P",Position.G2, "B");
        pieces[1][8] = new EmptySpace("P",Position.H2, "B");
        pieces[2][0] = new Edge("3",2, 0, "Y");
        pieces[2][1] = new EmptySpace("-",Position.A3, "Y");
        pieces[2][2] = new EmptySpace("-",Position.B3, "Y");
        pieces[2][3] = new EmptySpace("-",Position.C3, "Y");
        pieces[2][4] = new EmptySpace("-",Position.D3, "Y");
        pieces[2][5] = new EmptySpace("-",Position.E3, "Y");
        pieces[2][6] = new EmptySpace("-",Position.F3, "Y");
        pieces[2][7] = new EmptySpace("-",Position.G3, "Y");
        pieces[2][8] = new EmptySpace("-",Position.H3, "Y");
        pieces[3][0] = new Edge("4",3, 0, "Y");
        pieces[3][1] = new EmptySpace("-",Position.A4, "Y");
        pieces[3][2] = new EmptySpace("-",Position.B4, "Y");
        pieces[3][3] = new EmptySpace("-",Position.C4, "Y");
        pieces[3][4] = new EmptySpace("-",Position.D4, "Y");
        pieces[3][5] = new EmptySpace("-",Position.E4, "Y");
        pieces[3][6] = new EmptySpace("-",Position.F4, "Y");
        pieces[3][7] = new EmptySpace("-",Position.G4, "Y");
        pieces[3][8] = new EmptySpace("-",Position.H4, "Y");
        pieces[4][0] = new Edge("5",4, 0, "Y");
        pieces[4][1] = new EmptySpace("-",Position.A5, "Y");
        pieces[4][2] = new EmptySpace("-",Position.B5, "Y");
        pieces[4][3] = new EmptySpace("-",Position.C5, "Y");
        pieces[4][4] = new EmptySpace("-",Position.D5, "Y");
        pieces[4][5] = new EmptySpace("-",Position.E5, "Y");
        pieces[4][6] = new EmptySpace("-",Position.F5, "Y");
        pieces[4][7] = new EmptySpace("-",Position.G5, "Y");
        pieces[4][8] = new EmptySpace("-",Position.H5, "Y");
        pieces[5][0] = new Edge("6",5, 0, "Y");
        pieces[5][1] = new EmptySpace("-",Position.A6, "Y");
        pieces[5][2] = new EmptySpace("-",Position.B6, "Y");
        pieces[5][3] = new EmptySpace("-",Position.C6, "Y");
        pieces[5][4] = new EmptySpace("-",Position.D6, "Y");
        pieces[5][5] = new EmptySpace("-",Position.E6, "Y");
        pieces[5][6] = new EmptySpace("-",Position.F6, "Y");
        pieces[5][7] = new EmptySpace("-",Position.G6, "Y");
        pieces[5][8] = new EmptySpace("-",Position.H6, "Y");
        pieces[6][0] = new Edge("7",6, 0, "Y");
        pieces[6][1] = new Pawn("P",Position.A7, "W");
        pieces[6][2] = new Pawn("P",Position.B7, "W");
        pieces[6][3] = new Pawn("P",Position.C7, "W");
        pieces[6][4] = new Pawn("P",Position.D7, "W");
        pieces[6][5] = new Pawn("P",Position.E7, "W");
        pieces[6][6] = new Pawn("P",Position.F7, "W");
        pieces[6][7] = new Pawn("P",Position.G7, "W");
        pieces[6][8] = new Pawn("P",Position.H7, "W");
        pieces[7][0] = new Edge("8",7, 1, "Y");
        pieces[7][1] = new Rook("R",Position.A8, "W");
        pieces[7][2] = new Horse("H",Position.B8, "W");
        pieces[7][3] = new Bishop("B",Position.C8, "W");
        pieces[7][4] = new Queen("Q",Position.D8, "W");
        pieces[7][5] = new King("K",Position.E8, "W");
        pieces[7][6] = new Bishop("B",Position.F8, "W");
        pieces[7][7] = new Horse("H",Position.G8, "W");
        pieces[7][8] = new Rook("R",Position.H8, "W");
        pieces[8][0] = new Edge(" ",8, 0, "Y");
        pieces[8][1] = new Edge("A",8, 1, "Y");
        pieces[8][2] = new Edge("B",8, 2, "Y");
        pieces[8][3] = new Edge("C",8, 3, "Y");
        pieces[8][4] = new Edge("D",8, 4, "Y");
        pieces[8][5] = new Edge("E",8, 5, "Y");
        pieces[8][6] = new Edge("F",8, 6, "Y");
        pieces[8][7] = new Edge("G",8, 7, "Y");
        pieces[8][8] = new Edge("H",8, 8, "Y");

        return pieces;
    }
}
