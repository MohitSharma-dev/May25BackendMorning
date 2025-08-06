package TicTacToe;

public class Cell {
    private int row;
    private int col;
    private CellState cellState;
    private Player player;

    public Cell(int row, int col) {
        this.col = col;
        this.row = row;
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

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
