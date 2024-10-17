package src.main.java.pieces;

import src.main.java.board.Tile;

import java.util.Set;

public class Bishop extends Piece {
    public Bishop(Tile startingPosition, boolean isWhite) {
        super(startingPosition, isWhite);
    }

    /**
     * {@inheritDoc}<p>
     * A bishop can move to any square diagonally from it, stopping at the first piece
     * obstructing its path.
     *
     * @param target the tile that is intended to be moved to
     * @return true if the tile can be moved to; false if it cannot.
     */
    @Override
    public boolean makeMove(Tile target) {
        return false;
    }

    @Override
    public Set<Tile> possibleMoves() {
        return Set.of();
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "♗" : "♝";
    }
}
