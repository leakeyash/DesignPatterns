package factory.ingredient;

import factory.PizzaStyle;

public class LargerPizzaStoreDrive {
    public static void main(String[] args){
        PizzaStore ps=new NYPizzaStore();
        ps.orderPizza(PizzaStyle.cheese);
    }
}
