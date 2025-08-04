package TicTacToe;

import TicTacToe.strategies.WinningStrategy;

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
        List<WinningStrategy> winningStrategies = new ArrayList<>();
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
    }

    public String getWinner(Game game){
        // TODO
        return game.getWinner().getName();
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
            System.out.print("Add Player details : Name Symbol");
            System.out.println("Please enter the name : ");
            String name = scanner.next();
            System.out.println("Please enter the symbol : ");
            String symbol = scanner.next();
//            String details = scanner.nextLine();
//            System.out.println(details);
//            String[] detailsArray = details.split(" ");
            Player player = new Human(i , name, PlayerType.HUMAN , new Symbol(symbol));
        }
        return players;
    }

}


// gameController -> game.display() -> board.display() -> cell.display()

//|-||-||-|
//|-||-||X|
//| | | |
