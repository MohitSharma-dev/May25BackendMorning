package DesignPrinciplesAndPatterns.Decorator;

public class Client {
    public static void main(String[] args) {
        Beverage b = new Decaf();
        System.out.println(b.getCost());
        b.getDescription();

        Beverage b1 = new ChocoChip(new Milk(b)) ;
        b1 = new Soy(b1);
        b1 = new ChocoChip(b1);

        System.out.println(b1.getCost());
        b1.getDescription();
    }
}

// Introduce Add-ons
// Added dynamically
// + We don't want to change the existing code
