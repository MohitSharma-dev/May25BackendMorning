package TicTacToe;

public class GameClient {
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
        while(gameController.getGameState(game).equals(GameState.NOT_STARTED)){

            // 3.1 display the board
            gameController.display(game);
            // 3.2 makeMove : we will also check the winner and update the state if required
            gameController.makeMove(game);
        }
        // 4. Check the winner / Draw and announce the result

        if(gameController.getGameState(game).equals(GameState.SUCCESS)){
            System.out.println("Winner is : " + gameController.getWinner(game));
        } else if (gameController.getGameState(game).equals(GameState.DRAW)){
            System.out.println("Game ends in a draw!");
        }


    }
}
