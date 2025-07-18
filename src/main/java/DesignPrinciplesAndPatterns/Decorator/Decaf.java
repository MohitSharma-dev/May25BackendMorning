package DesignPrinciplesAndPatterns.Decorator;

public class Decaf extends Beverage{
    @Override
    public void getDescription() {
        System.out.println("Decaf");
    }

    @Override
    public int getCost() {
        return 50;
    }
}
