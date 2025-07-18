package DesignPrinciplesAndPatterns.Decorator;

public class Whip extends Addon {
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return 5 + beverage.getCost();
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Added Whip");
    }
}
