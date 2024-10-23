package Exoplanets;

public class ATypeStar  extends HostStar {
    public ATypeStar(String name, double mass, double radius, double temperature) {
        super(name, mass, radius, temperature);
    }

    @Override
    public String getStarType() {
        return "A-Type";
    }
}
