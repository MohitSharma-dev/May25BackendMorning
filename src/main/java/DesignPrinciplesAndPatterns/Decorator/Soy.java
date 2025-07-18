package DesignPrinciplesAndPatterns.Decorator;

public class Soy extends Addon{
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return 8 + beverage.getCost();
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Added Soy");
    }
}
