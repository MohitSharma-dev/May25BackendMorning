package TicTacToe;

import java.util.Scanner;

public class GameClient {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("We will play the game here!");
        // Implement Singleton pattern
        GameController gameController = new GameController();


        // 1. We need a Board , List of Players and winning strategies
            // client will pass dimension
            // Player details
            // select the winning strategies
        // 2. We need to create Game object : start the game
        Game game = gameController.startGame();
        gameController.display(game);
        // 3. Keep on playing the game until the game is in IN_PROGRESS state
        while(gameController.getGameState(game).equals(GameState.IN_PROGRESS)){

            // 3.1 display the board

            // 3.2 makeMove : we will also check the winner and update the state if required
            gameController.makeMove(game);
            gameController.display(game);

            System.out.println("Does anyone want to undo the last move ? [Y?N]");
            String input = scanner.nextLine();
            if(input.equals("Y")){
                gameController.undo(game);
                System.out.println("Undo completed!");
                gameController.display(game);
            }
        }
        // 4. Check the winner / Draw and announce the result

        if(gameController.getGameState(game).equals(GameState.SUCCESS)){
            System.out.println("Winner is : " + gameController.getWinner(game));
        } else if (gameController.getGameState(game).equals(GameState.DRAW)){
            System.out.println("Game ends in a draw!");
        }


    }
}

// Setup the flow of the game
// Implemented display

// Implementing the MakeMove

// HUMAN
    // Input from the player
    // Validate the input



// BOT
    // Some algorithm will suggest the move


// update the board : Mark the cell with the symbol + state
// update the turn
// add moves in the list of moves
// check winner/draw using all the selected strategies
// assign the winner
// change the state of the game



// Requirements
// Class diagram
// Code
