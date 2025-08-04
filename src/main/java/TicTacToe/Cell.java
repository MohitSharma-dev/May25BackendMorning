package TicTacToe;

public class Cell {
    private int row;
    private int col;
    private CellState cellState;
    private Player player;

    public Cell(int col, int row) {
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
}
