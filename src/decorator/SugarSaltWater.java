package decorator;

public class SugarSaltWater implements Water {
    String description = "Sugar Salt Water";
    @Override
    public String getDescription() {
        return description;
    }
}
