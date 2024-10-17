package src.main.java.pieces;

import src.main.java.board.Tile;

import java.util.Set;

public class Rook extends Piece {
    private boolean hasMoved = false;

    public Rook(Tile startingPosition, boolean isWhite) {
        super(startingPosition, isWhite);
    }

    public boolean hasMoved() {
        return hasMoved;
    }

    /**
     * {@inheritDoc}<p>
     * A rook can move to any square horizontally or vertically from it, stopping at the
     * first piece obstructing its path. The closest rook to the King can also 'castle' to swap
     * if the bishop and knight in the middle have moved and neither rook nor king has moved yet.
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
        return isWhite() ? "♖" : "♜";
    }
}
