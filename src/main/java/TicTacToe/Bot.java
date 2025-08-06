package TicTacToe;

import TicTacToe.strategies.BotPlayingStrategy;
import TicTacToe.strategies.BotPlayingStrategyFactory;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(Integer id, String name, PlayerType playerType, Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(id, name, playerType, symbol);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategyByDifficultyLevel(botDifficultyLevel);
    }

    @Override
    public Move makeMove(Board board) {
       return botPlayingStrategy.makeMove(board , this);
    }
}
