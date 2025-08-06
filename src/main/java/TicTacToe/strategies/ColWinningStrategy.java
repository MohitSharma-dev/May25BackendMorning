package TicTacToe.strategies;

import TicTacToe.Board;
import TicTacToe.Move;

public class ColWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {
        
    }
}
