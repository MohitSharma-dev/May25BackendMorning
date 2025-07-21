package DesignPrinciplesAndPatterns.SOLID.BirdV5;

import java.util.List;

public class Client {

    public static void doSomething(List<Flyable> birds){
        for(Flyable bird : birds) {
            bird.fly();
        }
    }

    public static void main(String[] args) {
        Bird b = new Pegion();
        Pegion b1 = new Pegion();
        Flyable f = new Pegion();

        b.setFlyingBehaviourType(FlyingBehaviourType.LOW);

        Sparrow sp = new Sparrow(FlyingBehaviourType.LOW);
        sp.fly();
        sp.setFlyingBehaviour(new HighFlying());
        sp.fly();
    }
}


// PhonePe : YesBank => RBI said , yes bank you can't support transactions anymore


// PhonePe => <<BankAPI>> methods => Yes Bank Implemented these methods