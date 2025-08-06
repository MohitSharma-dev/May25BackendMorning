package TicTacToe.strategies;

import TicTacToe.*;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {
   // EASY : BOT makes the move in next empty cell
    @Override
    public Move makeMove(Board board , Player player) {
        for(List<Cell> row : board.getGrid()){
            for(Cell cell : row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return new Move(new Cell(cell.getRow(), cell.getCol()), player);
                }
            }
        }
        return null;
    }
}
