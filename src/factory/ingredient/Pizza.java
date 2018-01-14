package factory.ingredient;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;

    abstract void prepare();

    public void bake(){
        System.out.println("Baking");
    }
    public void cut(){
        System.out.println("Cutting");
    }
    public void box(){
        System.out.println("Boxing");
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
