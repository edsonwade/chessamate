package game.pieces;

import game.boardgame.Board;
import game.chess.ChessPiece;
import game.chess.Color;

public class Rook extends ChessPiece {


    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
