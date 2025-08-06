package TicTacToe.strategies;

import TicTacToe.Board;
import TicTacToe.Move;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy {
    private HashMap<Integer, HashMap<String, Integer>> rowCount = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        String symbol = move.getCell().getPlayer().getSymbol().getSym();

        if(!rowCount.containsKey(row)) {
            rowCount.put(row, new HashMap<>());
        }
        if(!rowCount.get(row).containsKey(symbol)) {
            rowCount.get(row).put(symbol, 0);
        }
        // increase the frequency
        rowCount.get(row).put(symbol, rowCount.get(row).get(symbol) + 1);

        return rowCount.get(row).get(symbol) == board.getSize();
    }

    @Override
    public void handleUndo(Board board, Move move) {
        int row = move.getCell().getRow();
        String symbol = move.getPlayer().getSymbol().getSym();

        rowCount.get(row).put(symbol, rowCount.get(row).get(symbol) - 1);
    }
}

// maintain a hashmap
    // row , symbol , count ?


//{
//    0 : {
//            "X" : 0,
//            "O" : 0
//        },
//    1 : {
//            "X" : 1,
//            "O" : 2
//        },
//    2 :  {
//        "X" : 1,
//        "O" : 2
//        },
//
//}