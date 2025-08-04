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
    }

    public void makeMove(Game game){
        // TODO
    }

    public String getWinner(Game game){
        // TODO
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
            String details = scanner.nextLine();
            String[] detailsArray = details.split(" ");
            Player player = new Human(i , detailsArray[0], PlayerType.HUMAN , new Symbol(detailsArray[1]));
        }
        return players;
    }

}


// gameController -> game.display() -> board.display() -> cell.display()

//|-||-||-|
//|-||-||X|
//| | | |
