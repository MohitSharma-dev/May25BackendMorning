package TicTacToe.strategies;

import TicTacToe.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyByDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        BotPlayingStrategy botPlayingStrategy = null;
        if(botDifficultyLevel == BotDifficultyLevel.EASY) {
            botPlayingStrategy = new EasyBotPlayingStrategy();
        } else if (botDifficultyLevel == BotDifficultyLevel.MEDIUM) {
            botPlayingStrategy = new MediumBotPlayingStrategy();
        } else if (botDifficultyLevel == BotDifficultyLevel.HARD) {
            botPlayingStrategy = new HardBotPlayingStrategy();
        }
        return botPlayingStrategy;
    }
}
