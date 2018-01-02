package strategy;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }
}
