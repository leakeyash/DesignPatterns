package decorator;

public class Sugar implements Additive {

    Water water;
    public Sugar(Water water)
    {
        this.water = water;
    }
    @Override
    public String display() {
        return "Sugar";
    }

    @Override
    public String getDescription() {
        return water.getDescription()+", add sugar";
    }
}
