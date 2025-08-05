package TicTacToe.strategies;

import TicTacToe.Board;
import TicTacToe.Move;

import java.util.ArrayList;
import java.util.HashMap;

public class DiagonalWinningStrategy implements WinningStrategy{
    private int dimension;
    private ArrayList<HashMap<String, Integer>> symbolCount;
    public DiagonalWinningStrategy(int dimension) {
        this.dimension = dimension;
        this.symbolCount = new ArrayList<>();
        for (int i = 0; i < dimension; i++) {
            symbolCount.add(new HashMap<>());
        }
    }

    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
