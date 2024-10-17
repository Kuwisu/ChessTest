package src.main.java.pieces;

import src.main.java.board.Tile;

import java.util.Set;

/**
 * A pawn, the lowest rank chess piece that marches forward from the front line.
 */
public class Pawn extends Piece {
    private boolean hasMoved = false;

    public Pawn(Tile startingPosition, boolean isWhite) {
        super(startingPosition, isWhite);
    }

    public boolean hasMoved() {
        return hasMoved;
    }

    /**
     * {@inheritDoc}<p>
     * A pawn can move forward one tile to move, or diagonally one tile to capture.
     * It can also move forward two tiles for its initial move,
     * it can 'promote' to a better piece if it gets to the furthest row,
     * and it can 'en passant,' described in detail in {@code googleEnPassant()}.
     *
     * @param target the tile that is intended to be moved to
     * @return true if the tile can be moved to; false if it cannot.
     */
    @Override
    public boolean makeMove(Tile target) {
        hasMoved = true;
        return false;
    }

    /**
     * Checks whether a pawn can en passant - diagonally move past a pawn that has just
     * moved two tiles in order to capture it. Holy Hell
     *
     * @return whether an en passant is possible
     */
    private boolean googleEnPassant() {
        return false;
    }

    @Override
    public Set<Tile> possibleMoves() {
        return Set.of();
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "♙" : "♟";
    }
}
