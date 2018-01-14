package factory.ingredient;

import factory.PizzaStyle;

public class NYPizzaStore extends factory.ingredient.PizzaStore {
    @Override
    public factory.ingredient.Pizza createPizza(PizzaStyle type) {
        factory.ingredient.Pizza pizza=null;
        PizzaIngredientFactory pizzaIngredientFactory=new NYPizzaIngredientFactory();
        if(type==PizzaStyle.cheese){
            pizza = new ChessePizza(pizzaIngredientFactory);
            pizza.setName("Ny style cheese pizza");
        }
        return pizza;
    }
}
