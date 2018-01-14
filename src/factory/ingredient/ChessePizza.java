package factory.ingredient;

public class ChessePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ChessePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    void prepare() {
        System.out.println("Preparing "+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
