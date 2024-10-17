package src.main.java.board;

public class Tile {
    private final int column;
    private final int row;

    public Tile(int verticalPosition, int horizontalPosition) {
        this.column = verticalPosition;
        this.row = horizontalPosition;
    }

    /**
     * A tile code is a letter (corresponding to the column) and number (corresponding to the row).
     * Columns are stored as numbers for calculation and transposed here.
     *
     * @return the tile code e.g. 'A1'.
     */
    public String getTileCode() {
        return (char) (column + 64) + "" + row;
    }
}
