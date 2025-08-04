package TicTacToe.strategies;

import TicTacToe.Board;
import TicTacToe.Move;

public class DiagonalWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
