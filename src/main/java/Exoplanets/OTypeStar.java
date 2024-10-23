package Exoplanets;

public class OTypeStar  extends HostStar {
    public OTypeStar(String name, double mass, double radius, double temperature) {
        super(name, mass, radius, temperature);
    }

    @Override
    public String getStarType() {
        return "O-Type";
    }
}
