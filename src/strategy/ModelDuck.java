package strategy;

public class ModelDuck extends Duck{
    @Override
    public void display() {
        System.out.println("Model Duck");
    }

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
}
