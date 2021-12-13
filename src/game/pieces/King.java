package game.pieces;

import game.boardgame.Board;
import game.chess.ChessPiece;
import game.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
