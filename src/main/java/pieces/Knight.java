package src.main.java.pieces;

import src.main.java.board.Tile;

import java.util.Set;

public class Knight extends Piece {
    public Knight(Tile startingPosition, boolean isWhite) {
        super(startingPosition, isWhite);
    }

    /**
     * {@inheritDoc}<p>
     * A knight can move in an 'L' shape spanning 3 tiles; for example, it can move
     * two tiles up and one tile left, or two tiles right and one tile down. It is also
     * the only piece that can pass over other pieces.
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
        return isWhite() ? "♘" : "♞";
    }
}
