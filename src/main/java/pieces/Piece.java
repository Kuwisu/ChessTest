package src.main.java.pieces;

import src.main.java.board.*;

import java.util.Set;

/**
 * A Chess piece that can be moved around on a board.
 */
public abstract class Piece {
    private final boolean isWhite;
    private Tile position;

    public Piece(Tile startingPosition, boolean isWhite) {
        position = startingPosition;
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setPosition(Tile position) {
        this.position = position;
    }

    public Tile getPosition() {
        return position;
    }

    /**
     * Move a piece from one tile to another if eligible.
     * If a check is encountered, update the board status;
     * if attempting to move onto an opponent piece, evaluate whether it can be taken.
     *
     * @param target the tile that is intended to be moved to
     * @return true if the tile can be moved to; false if it cannot.
     */
    public abstract boolean makeMove(Tile target);

    /**
     * Inform the user's input with a list of moves that a piece can make in their current position
     *
     * @return every position that a piece can move to
     */
    public abstract Set<Tile> possibleMoves();

    /**
     * Get a static unicode piece symbol dependent on side.
     *
     * @return a white symbol representing the piece if {@code isWhite()}; a black symbol if not.
     */
    public abstract String getSymbol();
}
