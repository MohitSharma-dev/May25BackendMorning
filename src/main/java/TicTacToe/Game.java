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
        this.nextPlayerIndex = 0;
        this.moves = new ArrayList<>();
        this.winner = null;
    }

    public void validateMove(Move move) {
        // Cell should be valid
        int row = move.getCell().getRow();
        int col  = move.getCell().getCol();

        if(row < 0 || row > getBoard().getSize() || col < 0 || col > getBoard().getSize()) {
            throw new RuntimeException("Invalid move!");
        }

        if(getBoard().getCell(row ,col).getCellState().equals(CellState.FILLED)) {
            throw new RuntimeException("Invalid move! Cell is filled already.");
        }
    }

    public void updateGame(Move move , Player currentPlayer){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell actualCell = getBoard().getCell(row , col);
        actualCell.setPlayer(currentPlayer);
        actualCell.setCellState(CellState.FILLED);

        nextPlayerIndex++;
        nextPlayerIndex %= players.size();

        move.setCell(actualCell);
        moves.add(move);
    }

    public boolean checkWinner(Move move){
        for(WinningStrategy strategy : winningStrategies) {
            if(strategy.checkWinner(getBoard() , move)){
               return true;
            }
        }
        return false;
    }

    public boolean checkDraw(){
        return moves.size() == board.getSize() * board.getSize();
    }


    public void makeMove(){
        // we need to identify the currentPlayer
        Player currentPlayer = players.get(nextPlayerIndex);
        Move move = currentPlayer.makeMove(board);

        try {
            validateMove(move);
        } catch (Exception ex){
            System.out.println(ex.getMessage() + "Please try again!");
            return;
        }

        // update the state of the game
        updateGame(move , currentPlayer);

        // Now check the winner
        if(checkWinner(move)){
            winner = currentPlayer;
            setGameState(GameState.SUCCESS);
        } else if(checkDraw()){
            setGameState(GameState.DRAW);
        }

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
}
