package TicTacToe;

public class Human extends Player {
    private int level;
    private int coins;

    public Human(Integer id, String name, PlayerType playerType, Symbol symbol) {
        super(id, name, playerType, symbol);
        level = 1;
        coins = 50;
    }
}
