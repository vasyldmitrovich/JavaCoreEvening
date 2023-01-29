package com.softserve.Project.Chess;

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
        pieces[0][0] = new Piece("1",0, 0, "Y");
        pieces[0][1] = new Piece("R",Position.A1, "B");
        pieces[0][2] = new Piece("H",Position.B1, "B");
        pieces[0][3] = new Piece("B",Position.C1, "B");
        pieces[0][4] = new Piece("Q",Position.D1, "B");
        pieces[0][5] = new Piece("K",Position.E1, "B");
        pieces[0][6] = new Piece("B",Position.F1, "B");
        pieces[0][7] = new Piece("H",Position.G1, "B");
        pieces[0][8] = new Piece("R",Position.H1, "B");
        pieces[1][0] = new Piece("2",1, 0, "Y");
        pieces[1][1] = new Piece("P",Position.A2, "B");
        pieces[1][2] = new Piece("P",Position.B2, "B");
        pieces[1][3] = new Piece("P",Position.C2, "B");
        pieces[1][4] = new Piece("P",Position.D2, "B");
        pieces[1][5] = new Piece("P",Position.E2, "B");
        pieces[1][6] = new Piece("P",Position.F2, "B");
        pieces[1][7] = new Piece("P",Position.G2, "B");
        pieces[1][8] = new Piece("P",Position.H2, "B");
        pieces[2][0] = new Piece("3",2, 0, "Y");
        pieces[2][1] = new Piece("-",Position.A3, "Y");
        pieces[2][2] = new Piece("-",Position.B3, "Y");
        pieces[2][3] = new Piece("-",Position.C3, "Y");
        pieces[2][4] = new Piece("-",Position.D3, "Y");
        pieces[2][5] = new Piece("-",Position.E3, "Y");
        pieces[2][6] = new Piece("-",Position.F3, "Y");
        pieces[2][7] = new Piece("-",Position.G3, "Y");
        pieces[2][8] = new Piece("-",Position.H3, "Y");
        pieces[3][0] = new Piece("4",3, 0, "Y");
        pieces[3][1] = new Piece("-",Position.A4, "Y");
        pieces[3][2] = new Piece("-",Position.B4, "Y");
        pieces[3][3] = new Piece("-",Position.C4, "Y");
        pieces[3][4] = new Piece("-",Position.D4, "Y");
        pieces[3][5] = new Piece("-",Position.E4, "Y");
        pieces[3][6] = new Piece("-",Position.F4, "Y");
        pieces[3][7] = new Piece("-",Position.G4, "Y");
        pieces[3][8] = new Piece("-",Position.H4, "Y");
        pieces[4][0] = new Piece("5",4, 0, "Y");
        pieces[4][1] = new Piece("-",Position.A5, "Y");
        pieces[4][2] = new Piece("-",Position.B5, "Y");
        pieces[4][3] = new Piece("-",Position.C5, "Y");
        pieces[4][4] = new Piece("-",Position.D5, "Y");
        pieces[4][5] = new Piece("-",Position.E5, "Y");
        pieces[4][6] = new Piece("-",Position.F5, "Y");
        pieces[4][7] = new Piece("-",Position.G5, "Y");
        pieces[4][8] = new Piece("-",Position.H5, "Y");
        pieces[5][0] = new Piece("6",5, 0, "Y");
        pieces[5][1] = new Piece("-",Position.A6, "Y");
        pieces[5][2] = new Piece("-",Position.B6, "Y");
        pieces[5][3] = new Piece("-",Position.C6, "Y");
        pieces[5][4] = new Piece("-",Position.D6, "Y");
        pieces[5][5] = new Piece("-",Position.E6, "Y");
        pieces[5][6] = new Piece("-",Position.F6, "Y");
        pieces[5][7] = new Piece("-",Position.G6, "Y");
        pieces[5][8] = new Piece("-",Position.H6, "Y");
        pieces[6][0] = new Piece("7",6, 0, "Y");
        pieces[6][1] = new Piece("P",Position.A7, "W");
        pieces[6][2] = new Piece("P",Position.B7, "W");
        pieces[6][3] = new Piece("P",Position.C7, "W");
        pieces[6][4] = new Piece("P",Position.D7, "W");
        pieces[6][5] = new Piece("P",Position.E7, "W");
        pieces[6][6] = new Piece("P",Position.F7, "W");
        pieces[6][7] = new Piece("P",Position.G7, "W");
        pieces[6][8] = new Piece("P",Position.H7, "W");
        pieces[7][0] = new Piece("8",7, 1, "Y");
        pieces[7][1] = new Piece("R",Position.A8, "W");
        pieces[7][2] = new Piece("H",Position.B8, "W");
        pieces[7][3] = new Piece("B",Position.C8, "W");
        pieces[7][4] = new Piece("Q",Position.D8, "W");
        pieces[7][5] = new Piece("K",Position.E8, "W");
        pieces[7][6] = new Piece("B",Position.F8, "W");
        pieces[7][7] = new Piece("H",Position.G8, "W");
        pieces[7][8] = new Piece("R",Position.H8, "W");
        pieces[8][0] = new Piece(" ",8, 0, "Y");
        pieces[8][1] = new Piece("A",8, 1, "Y");
        pieces[8][2] = new Piece("B",8, 2, "Y");
        pieces[8][3] = new Piece("C",8, 3, "Y");
        pieces[8][4] = new Piece("D",8, 4, "Y");
        pieces[8][5] = new Piece("E",8, 5, "Y");
        pieces[8][6] = new Piece("F",8, 6, "Y");
        pieces[8][7] = new Piece("G",8, 7, "Y");
        pieces[8][8] = new Piece("H",8, 8, "Y");

        return pieces;
    }
}
