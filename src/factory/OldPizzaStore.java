package factory;

public class OldPizzaStore {
    SimplePizzaFactory pizzaFactory;
    public OldPizzaStore(SimplePizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }
    /*public Pizza orderPizza(String type){
        Pizza pizza=pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }*/
}
