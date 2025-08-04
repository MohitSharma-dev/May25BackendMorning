package TicTacToe.strategies;

import TicTacToe.Board;
import TicTacToe.Move;

public interface BotPlayingStrategy {
    public Move makeMove(Board board);
}
