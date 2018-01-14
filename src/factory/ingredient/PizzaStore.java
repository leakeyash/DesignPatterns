package factory.ingredient;

import factory.PizzaStyle;

public abstract class PizzaStore {
    public Pizza orderPizza(PizzaStyle type){
        Pizza pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(PizzaStyle type);
}
