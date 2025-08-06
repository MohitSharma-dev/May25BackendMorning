package TicTacToe.strategies;

import TicTacToe.Board;
import TicTacToe.Move;

import java.util.ArrayList;
import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy {
    private int dimension;
    private ArrayList<HashMap<String, Integer>> symbolCount;
    public RowWinningStrategy(int dimension) {
        this.dimension = dimension;
        this.symbolCount = new ArrayList<>();
        for (int i = 0; i < dimension; i++) {
            symbolCount.add(new HashMap<>());
        }
    }

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        String symbol = move.getPlayer().getSymbol().getSym();
        int freq = symbolCount.get(row).getOrDefault(symbol, 0);
        freq++;
        symbolCount.get(row).put(symbol, freq);

        if(freq == dimension) return true;
        return false;
    }
}

// maintain a hashmap