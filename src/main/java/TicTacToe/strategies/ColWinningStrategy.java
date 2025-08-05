package TicTacToe.strategies;

import TicTacToe.Board;
import TicTacToe.Move;

import java.util.ArrayList;
import java.util.HashMap;

public class ColWinningStrategy implements WinningStrategy {
    private int dimension;
    private ArrayList<HashMap<String, Integer>> symbolCount;
    public ColWinningStrategy(int dimension) {
        this.dimension = dimension;
        this.symbolCount = new ArrayList<>();
        for (int i = 0; i < dimension; i++) {
            symbolCount.add(new HashMap<>());
        }
    }

    @Override
    public boolean checkWinner(Board board, Move move) {
        int col= move.getCell().getCol();
        String symbol = move.getPlayer().getSymbol().getSym();
        int freq = symbolCount.get(col).getOrDefault(symbol, 0);
        freq++;
        symbolCount.get(col).put(symbol, freq);

        if(freq == dimension) return true;
        return false;
    }
}
