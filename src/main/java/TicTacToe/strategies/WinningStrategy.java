package TicTacToe.strategies;

import TicTacToe.Board;
import TicTacToe.Move;

public interface WinningStrategy {
    public boolean checkWinner(Board board, Move move);
}
