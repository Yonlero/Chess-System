package boardgame;

public class Position {
    //---------------------Variables--------------------
    private int row;
    private int column;

    //---------------------Construct------------------
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    //Get and Set
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    //----------------------ToString-----------------------
    @Override
    public String toString() {
        return row + ", " + column;
    }
}
