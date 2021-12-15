package game.chess;

import game.boardgame.BoardException;
import game.boardgame.Position;

public class ChessPosition {
    private int column;
    private int row;

    public ChessPosition(int column, int row) throws CheckException {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new CheckException("Error instantiating ChessPosition. values are form a1 to h8");
        }
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position) throws CheckException {
        return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return " " + column + row
                ;
    }
}
