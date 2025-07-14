package DesignPrinciplesAndPatterns.Factory.components.Button;

public class AndroidButton implements Button{
    @Override
    public void click() {
        System.out.println("Android button clicked");
    }
}
