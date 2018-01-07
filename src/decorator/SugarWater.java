package decorator;

public class SugarWater implements Water {
    String description = "Sugar Water";
    @Override
    public String getDescription() {
        return description;
    }
}
