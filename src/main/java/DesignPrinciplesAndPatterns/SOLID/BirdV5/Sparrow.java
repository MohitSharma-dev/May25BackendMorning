package DesignPrinciplesAndPatterns.SOLID.BirdV5;

public class Sparrow extends Bird implements Flyable {
    FlyingBehaviour flyingBehaviour;
    Sparrow(FlyingBehaviourType flyingBehaviourType){
//        this.flyingBehaviour = new LowFlying();
        this.flyingBehaviour = FlyingBehaviourFactory.createFlyingBehaviourByType(flyingBehaviourType);
    }
    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {
//        System.out.println("Flying Low");
        flyingBehaviour.doFlying();
    }

    public FlyingBehaviour getFlyingBehaviour() {
        return flyingBehaviour;
    }

    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }
}
