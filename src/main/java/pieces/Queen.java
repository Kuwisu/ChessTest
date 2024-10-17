package src.main.java.pieces;

import src.main.java.board.Tile;

import java.util.Set;

public class Queen extends Piece {
    public Queen(Tile startingPosition, boolean isWhite) {
        super(startingPosition, isWhite);
    }

    /**
     * {@inheritDoc}<p>
     * A Queen can move in all 8 directions, behaving like a rook and bishop at the same time.
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
        return isWhite() ? "♕" : "♛";
    }
}
