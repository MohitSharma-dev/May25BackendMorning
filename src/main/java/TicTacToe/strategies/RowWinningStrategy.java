package TicTacToe.strategies;

import TicTacToe.Board;
import TicTacToe.Move;

public class RowWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}

// maintain a hashmap