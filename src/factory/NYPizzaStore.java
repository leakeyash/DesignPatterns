package factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaStyle type) {
        Pizza pizza = null;
        if(type.equals(PizzaStyle.cheese)){
            pizza = new NYStyleCheesePizza();
        }
        else if(type.equals(PizzaStyle.greek)){
            pizza=new GreekPizza();
        }
        return pizza;
    }
}
