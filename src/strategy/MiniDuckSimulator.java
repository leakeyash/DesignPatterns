package strategy;

public class MiniDuckSimulator {
    public static void main(String[] args)
    {
        Duck duck=new MallardDuck();
        duck.performFly();
        duck.setFlyBehavior(new FlyNoWay());
        duck.performFly();
    }
}
