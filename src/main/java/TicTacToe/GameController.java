package TicTacToe;

import TicTacToe.strategies.ColWinningStrategy;
import TicTacToe.strategies.DiagonalWinningStrategy;
import TicTacToe.strategies.RowWinningStrategy;
import TicTacToe.strategies.WinningStrategy;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {
    private static Scanner scanner = new Scanner(System.in);
    public Game startGame(){
        // ask for the dimension
        int dimension = getDimension();
        // ask for player details
        List<Player> players = getPlayers(dimension);
        // ask for winning strategies : TODO!!
        List<WinningStrategy> winningStrategies = getWinningStrategies(dimension);
        // create the game object
        return new Game(dimension , players , winningStrategies);
    }

    public GameState getGameState(Game game){
        // logging
        return game.getGameState();
    }

    public void display(Game game){
        // TODO
        game.display();
    }

    public void makeMove(Game game){
        // TODO : Homework
            // It should take the input of the move
            // validate
            // update the board
            // check winner and update state if required

        System.out.println("Please enter the row number where you want to play:");
        int row = scanner.nextInt();
        System.out.println("Please enter the column number where you want to play:");
        int col = scanner.nextInt();
        boolean isMoveValid = validateMove(game, row, col);
        if(isMoveValid){
            game.makeMove(row, col);
        }else {
            System.out.println("You move is invalid. Please try again.");
            this.makeMove(game);
        }
    }

    public String getWinner(Game game){
        // TODO
        return game.getWinner().getName();
    }

    private boolean validateMove(Game game, int row, int col) {
        return game.validateMove(row, col);
    }

    private int getDimension(){
        System.out.println("Please enter the size of the board");
        int dimension = scanner.nextInt();
        return dimension;
    }

    private List<Player> getPlayers(int dimension){
        System.out.println("Let's add the players now : ");
        // Modify this function to take Bot as well
        List<Player> players = new ArrayList<>();
        for(int i = 0; i < dimension - 1; i++){
            System.out.println("Add Player details : Name Symbol");
            System.out.println("Please enter the name : ");
            String name = scanner.next();
            System.out.println("Please enter the symbol : ");
            String symbol = scanner.next();
//            String details = scanner.nextLine();
//            System.out.println(details);
//            String[] detailsArray = details.split(" ");
            Player player = new Human(i , name, PlayerType.HUMAN , new Symbol(symbol));
            players.add(player);
        }
        return players;
    }

    private List<WinningStrategy> getWinningStrategies(int dimension) {
        List<WinningStrategy> winningStrategies = new ArrayList<>();

        System.out.println("Do you want to include column winning strategy? (y/n)");
        String choice2 = scanner.nextLine();
        if(choice2.equalsIgnoreCase("y")) winningStrategies.add(new ColWinningStrategy(dimension));

        System.out.print("Do you want to include row winning strategy? (y/n)");
        String choice = scanner.nextLine();
        if(choice.equalsIgnoreCase("y")) winningStrategies.add(new RowWinningStrategy(dimension));

        System.out.println("Do you wnat to include diagonal winning strategy? (y/n)");
        String choice3 = scanner.nextLine();
        if(choice3.equalsIgnoreCase("y")) winningStrategies.add(new DiagonalWinningStrategy(dimension));

        return winningStrategies;
    }
}


// gameController -> game.display() -> board.display() -> cell.display()

//|-||-||-|
//|-||-||X|
//| | | |
