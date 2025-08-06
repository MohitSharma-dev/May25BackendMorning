package TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> grid;
    private int size;

    public Board(int size) {
        this.size = size;
        // TODO : we should get our grid ready based on the size
        grid = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            grid.add(new ArrayList<>());
            for (int j = 0; j < size; j++) {
                grid.get(i).add(new Cell(i, j));
            }
        }
    }

    public void display(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                grid.get(i).get(j).display();
            }
            System.out.println();
        }
    }

    public List<List<Cell>> getGrid() {
        return grid;
    }

    public void setGrid(List<List<Cell>> grid) {
        this.grid = grid;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Cell getCell(int row , int col){
        return grid.get(row).get(col);
    }
}
