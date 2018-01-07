package decorator;

public class Salt implements Additive {
    Water water;
    public Salt(Water water)
    {
        this.water = water;
    }
    @Override
    public String display() {
        return "Salt";
    }

    @Override
    public String getDescription() {
        return water.getDescription()+", add salt";
    }
}
