package Exoplanets;

public class FTypeStar  extends HostStar {
    public FTypeStar(String name, double mass, double radius, double temperature) {
        super(name, mass, radius, temperature);
    }

    @Override
    public String getStarType() {
        return "G-Type";
    }
}
