package DesignPrinciplesAndPatterns.Decorator;

public class HouseBlend extends Beverage{
    @Override
    public void getDescription() {
        System.out.println("House Blend");
    }

    @Override
    public int getCost() {
        return 45;
    }
}
