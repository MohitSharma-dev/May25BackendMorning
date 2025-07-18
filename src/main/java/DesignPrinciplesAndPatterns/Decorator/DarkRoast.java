package DesignPrinciplesAndPatterns.Decorator;

public class DarkRoast extends Beverage{
    @Override
    public void getDescription() {
        System.out.println("Dark Roast");
    }

    @Override
    public int getCost() {
       return 30;
    }
}
