package factory;

public class PizzaTestDrive {
    public static void main(String[] args){
        PizzaStore nyStore=new NYPizzaStore();
        PizzaStore chicagoStore=new ChicagoPizzaStore();

        Pizza pizza=nyStore.orderPizza(PizzaStyle.cheese);
        System.out.println("Henry ordered a " + pizza.getName()+"\n");

        pizza = chicagoStore.orderPizza(PizzaStyle.cheese);
        System.out.println("Ting ordered a " + pizza.getName()+"\n");

    }
}
