package TicTacToe;

import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private GameState gameState;
    private Player winner;
    private int nextPlayerIndex;
    private List<WinningStrategy> winningStrategies;
    private List<Move> moves;

    public Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.board = new Board(dimension);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.gameState = GameState.IN_PROGRESS;
        this.nextPlayerIndex = 1;
        this.moves = new ArrayList<>();
        this.winner = null;
    }

    public void display(){
        board.display();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public Move makeMove(int row, int col) {
        System.out.println("Inside game.makeMove function, creating new move");
        int playerIndex = (nextPlayerIndex-1+players.size())%players.size();
        Move move = players.get(playerIndex).makeMove(board, row, col);
        System.out.println("Move made");
        moves.add(move);
        checkWinner(move);
        nextPlayerIndex = (nextPlayerIndex + 1) % players.size();
        return move;
    }

    public boolean validateMove(int row, int col) {
        CellState cellState = board.getCellState(row, col);
        System.out.println("In validateMove fucntion: cellState=" + cellState);
        if(cellState.equals(CellState.EMPTY)) return true;
        return false;
    }

    public void updateBoard(Move move) {

    }

    public void checkWinner(Move move) {
        boolean flag = false;
        for(WinningStrategy winningStrategy : winningStrategies){
            if(winningStrategy.checkWinner(board, move)) {
                flag = true;
                break;
            }
        }

        if(flag){
            winner = move.getPlayer();
            gameState = GameState.SUCCESS;
        }
    }
}
