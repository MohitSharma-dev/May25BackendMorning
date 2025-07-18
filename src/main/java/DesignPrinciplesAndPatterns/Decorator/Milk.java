package DesignPrinciplesAndPatterns.Decorator;

public class Milk extends Addon {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return 12 + beverage.getCost();
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Added Milk");
    }
}
