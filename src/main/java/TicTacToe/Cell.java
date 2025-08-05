package TicTacToe;

public class Cell {
    private int row;
    private int col;
    private CellState cellState;
    private Player player;

    public Cell(int row, int col) {
        // Swap row and col position, earlier it was opposite causing an error because we were creating cell = new Cell(i, j)
        // so Cell was stroing row and col value in wrong order.
        this.row = row;
        this.col = col;
        this.cellState = CellState.EMPTY;
        this.player = null;
    }

    public void display(){
        if(cellState == CellState.EMPTY){
            System.out.print("| - |");
        } else if(cellState == CellState.FILLED){
            System.out.print("| " + player.getSymbol().getSym() + " |");
        }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
