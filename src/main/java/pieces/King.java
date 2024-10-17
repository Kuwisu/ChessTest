package src.main.java.pieces;

import src.main.java.board.Tile;

import java.util.Set;

public class King extends Piece {
    private boolean hasMoved = false;

    public King(Tile startingPosition, boolean isWhite) {
        super(startingPosition, isWhite);
    }

    public boolean hasMoved() {
        return hasMoved;
    }

    /**
     * {@inheritDoc}<p>
     * A King can move one tile in all 8 directions. However, it is unique in that it is
     * the win condition of the game, and so the King cannot be intentionally put into a
     * dangerous situation; the King must instead be trapped without any way of escape.
     * A King can also 'castle' to swap with the closest Rook if the obstructing pieces have
     * moved and neither the King nor the Rook has moved yet.
     *
     * @param target the tile that is intended to be moved to
     * @return true if the tile can be moved to; false if it cannot.
     */
    @Override
    public boolean makeMove(Tile target) {
        hasMoved = true;
        return false;
    }

    @Override
    public Set<Tile> possibleMoves() {
        return Set.of();
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "♔" : "♚";
    }
}
