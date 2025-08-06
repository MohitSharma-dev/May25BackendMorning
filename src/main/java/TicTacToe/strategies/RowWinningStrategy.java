package TicTacToe.strategies;

import TicTacToe.Board;
import TicTacToe.Cell;
import TicTacToe.Move;
import TicTacToe.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy {
    // we maintain a map to keep track of the count of symbols in each row
    // key is the row number, value is a map of symbols and their counts in that row
    // if a symbol's count reaches the size of the board, we have a winner
    private final Map<Integer, Map<String, Integer>> rowWinner = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {

        Cell cell= move.getCell();
        String symbol = move.getPlayer().getCharacter();
        int row = cell.getRow();
        if(!rowWinner.containsKey(row)) {
            rowWinner.put(row, new HashMap<>());
        }
        Map<String, Integer> symbolCount = rowWinner.get(row);
        symbolCount.put(symbol, symbolCount.getOrDefault(symbol, 0) + 1);
        if(symbolCount.get(symbol) == board.getSize()) {
            return true;
        }
        // if we have not found a winner yet, we return false
        return false;
    }
}
