package TicTacToe;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(Integer id, String name, PlayerType playerType, Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(id, name, playerType, symbol);
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
