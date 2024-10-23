package Exoplanets;

public class BTypeStar  extends HostStar {
    public BTypeStar(String name, double mass, double radius, double temperature) {
        super(name, mass, radius, temperature);
    }

    @Override
    public String getStarType() {
        return "B-Type";
    }
}
