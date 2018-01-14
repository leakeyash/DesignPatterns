package factory;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(PizzaStyle type) {
        Pizza pizza = null;
        if(type.equals(PizzaStyle.cheese)){
            pizza = new ChicagoStyleCheesePizza();
        }
        else if(type.equals(PizzaStyle.greek)){
            pizza=new GreekPizza();
        }
        return pizza;
    }
}
